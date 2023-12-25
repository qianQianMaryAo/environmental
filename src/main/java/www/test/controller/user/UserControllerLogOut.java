package www.test.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import www.test.tool.Constants;

import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
public class UserControllerLogOut {

    @RequestMapping("/logout")
    public ModelAndView loginOut(ModelAndView modelAndView, HttpSession httpSession){
        httpSession.removeAttribute(Constants.USER_SESSION);
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}
