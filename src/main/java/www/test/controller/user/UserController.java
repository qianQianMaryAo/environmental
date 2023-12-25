package www.test.controller.user;

import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import www.test.pojo.Role;
import www.test.pojo.User;
import www.test.service.role.RoleService;
import www.test.service.user.UserService;
import www.test.tool.Constants;
import www.test.tool.PageSupport;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/query")
    public ModelAndView query(@RequestParam(value = "queryname", required = false) String queryUserName,
                              @RequestParam(value = "userRole", required = false) String queryUserRole,
                              @RequestParam(value = "pageIndex", required = false) String pageIndex,
                              ModelAndView modelAndView) {
        Integer userRole = 0;
        Integer currentPageNo = 1;
        if (queryUserName == null) {
            queryUserName = "";
        }
        if (queryUserRole != null && !queryUserRole.equals("")) {
            userRole = Integer.valueOf(queryUserRole);
        }
        if (pageIndex != null) {
            currentPageNo = Integer.valueOf(pageIndex);
        }

        Integer pageSize = 5;
        Integer totalCount = userService.getUserCountService(queryUserName, userRole);
        PageSupport pageSupport = new PageSupport();
        pageSupport.setCurrentPageNo(currentPageNo);
        pageSupport.setPageSize(pageSize);
        pageSupport.setTotalCount(totalCount);

        int totalPageCount = pageSupport.getTotalPageCount();
        if (currentPageNo < 1) {
            currentPageNo = 1;
        } else if (currentPageNo > totalPageCount) {
            currentPageNo = totalPageCount;
        }
        List<User> userList = userService.getUserListService(queryUserName, userRole, (currentPageNo - 1) * pageSize, pageSize);
        List<Role> roleList = roleService.getRoleListService();
        modelAndView.addObject("userList", userList);
        modelAndView.addObject("roleList", roleList);
        modelAndView.addObject("queryUserName", queryUserName);
        modelAndView.addObject("userRole", userRole);
        modelAndView.addObject("totalPageCount", pageSupport.getTotalPageCount());
        modelAndView.addObject("totalCount", pageSupport.getTotalCount());
        modelAndView.addObject("currentPageNo", pageSupport.getCurrentPageNo());
        modelAndView.setViewName("/jsp/userlist.jsp");
        return modelAndView;

    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "userCode", required = false) String userCode,
                            @RequestParam(value = "userName", required = false) String userName,
                            @RequestParam(value = "userPassword", required = false) String userPassword,
                            @RequestParam(value = "phone", required = false) String phone,
                            @RequestParam(value = "email", required = false) String email,
                            @RequestParam(value = "address", required = false) String address,
                            @RequestParam(value = "userRole", required = false) String userRole,
                            ModelAndView modelAndView) {
        User user = new User();
        user.setUserCode(userCode);
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setTel(Long.valueOf(phone));
        user.setEmail(email);
        user.setAddress(address);
        user.setRoleId(Integer.valueOf(userRole));
        Integer user_1 = userService.addUserListService(user);
        if (user_1 != null) {
            modelAndView.setViewName("redirect:/user/query");
        } else {
            modelAndView.setViewName("/jsp/useradd.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("getrolelist")
    public List<Role> getRoleListId() {
        List<Role> roleList = roleService.getRoleListService();
        return roleList;
    }

    @RequestMapping("ucexist")
    public HashMap<Object, Object> getUserCodeExist(@Param("userCode") String userCode) {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        if (StringUtils.isNullOrEmpty(userCode)) {
            hashMap.put("userCode", "exist");
        } else {
            User user = userService.selectByNameAndPasswordService(userCode, null);
            if (user != null) {
                //用户已存在
                hashMap.put("userCode", "exist");
            } else {
                //
                hashMap.put("userCode", "false");
            }
        }
        return hashMap;
    }

    @RequestMapping("/modify")
    public ModelAndView modify(
            @RequestParam("uid") String id,
            ModelAndView modelAndView) {
        User user = userService.selectById(Integer.valueOf(id));
        modelAndView.addObject("user", user);
        if (user != null) {
            modelAndView.setViewName("/jsp/usermodify.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("/modifyexe")
    public ModelAndView modifyexe(@RequestParam("uid") String id,
                                  @RequestParam(value = "userCode", required = false) String userCode,
                                  @RequestParam(value = "userName", required = false) String userName,
                                  @RequestParam(value = "phone", required = false) String phone,
                                  @RequestParam(value = "email", required = false) String email,
                                  @RequestParam(value = "address", required = false) String address,
                                  @RequestParam(value = "userRole", required = false) String userRole,
                                  ModelAndView modelAndView) {
        User user = new User();
        user.setId(Integer.valueOf(id));
        user.setUserCode(userCode);
        user.setUserName(userName);
        user.setTel(Long.valueOf(phone));
        user.setEmail(email);
        user.setAddress(address);
        user.setRoleId(Integer.valueOf(userRole));
        Integer user_1 = userService.insertUserListService(user);
        if (user_1 != null) {
            modelAndView.setViewName("/user/query");
        } else {
            modelAndView.setViewName("/jsp/usermodify.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("/view")
    public ModelAndView view(@RequestParam("uid") String id,
                             ModelAndView modelAndView) {
        User user = userService.selectById(Integer.valueOf(id));
        modelAndView.addObject("user", user);
        if (user != null) {
            modelAndView.setViewName("/jsp/userview.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("/deluser")
    public HashMap<Object, Object> delete(@RequestParam("uid") String id) {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Integer id_1 = Integer.valueOf(id);
        if (id_1 < 0) {
            hashMap.put("delResult", "notexist");
        } else {
            if (userService.deleteByIdService(id_1) > 0) {
                hashMap.put("delResult", "true");
            } else {
                hashMap.put("delResult", "false");
            }
        }
        return hashMap;
    }

    @RequestMapping("/passwordmodify")
    public HashMap<Object, Object> passwordmodify(@RequestParam("oldpassword") String oldpassword,
                                                  HttpSession session) {
        User user = (User) session.getAttribute(Constants.USER_SESSION);
        User user_1 = userService.selectByNameAndPasswordService(user.getUserCode(), oldpassword);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        if (oldpassword == null) {
            hashMap.put("result", "error");
        } else if (user.getId() == null) {
            hashMap.put("result", "sessionerror");
        } else {
            if (user_1 != null) {
                hashMap.put("result", "true");
            } else {
                hashMap.put("result", "false");
            }
        }
        return hashMap;
    }

    @RequestMapping("/savepwd")
    public ModelAndView pwdModify(@RequestParam("oldpassword") String oldpassword,
                                  @RequestParam("newpassword") String newpassword,
                                  HttpSession session,
                                  ModelAndView modelAndView) {
        User user = (User) session.getAttribute(Constants.USER_SESSION);
        User user_1 = userService.selectByNameAndPasswordService(user.getUserCode(), oldpassword);
        if (user_1.getId()!=null){
            userService.modifyUserPasswordService(newpassword,user.getId());
            modelAndView.setViewName("/jsp/frame.jsp");
        }else {
            modelAndView.addObject("error","密码修改失败");
            modelAndView.setViewName("/jsp/pwdmodify.jsp");
        }
        return modelAndView;
    }
}
