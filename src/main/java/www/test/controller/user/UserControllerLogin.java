package www.test.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import www.test.pojo.Menus;
import www.test.pojo.User;
import www.test.service.menu.MenusService;
import www.test.service.user.UserService;
import www.test.tool.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller

public class UserControllerLogin {
    @Autowired
    private UserService userService;
    @Autowired
    private MenusService menusService;

    @RequestMapping("/login")
    public ModelAndView UserControllerLoginMethod(@RequestParam("username") String username,
                                                  @RequestParam("password") String password,
                                                  ModelAndView modelAndView,
                                                  HttpSession session) throws ServletException, IOException {
        User userLogin = userService.selectByNameAndPasswordService(username, password);
        if (userLogin != null && userLogin.getId() != null) {
            session.setAttribute(Constants.USER_SESSION, userLogin);
            System.out.println(session.getAttribute(Constants.USER_SESSION));
            //用户浏览权限
            User user = (User) session.getAttribute(Constants.USER_SESSION);
            List<Menus> menusList = menusService.getUserManagementService(user.getRoleId());
            List<Object> menuCodes = new ArrayList<Object>();
            for (Menus menus : menusList) {
                menuCodes.add(menus.getMenuCode());
            }
            session.setAttribute("menusCodes", menuCodes);
            modelAndView.setViewName("/jsp/frame.jsp");

        } else {
            modelAndView.addObject("error", "用户名或密码不正确");
            modelAndView.setViewName("/index.jsp");
        }
        return modelAndView;
    }
}