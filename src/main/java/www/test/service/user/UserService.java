package www.test.service.user;

import www.test.pojo.User;

import java.util.List;


public interface UserService {
    /**
     * 用户登录
     * @param userCode
     * @param userPassword
     * @return
     */
    User selectByNameAndPasswordService(String userCode, String userPassword);

    /**
     * 用户列表显示及查询
     * @param userName
     * @param userRole
     * @param currentPageNo
     * @param pageSize
     * @return
     */
    List<User> getUserListService(String userName,Integer userRole,Integer currentPageNo,Integer pageSize);

    /**
     * 分页功能：获取用户总数
     * @param userName
     * @param userRole
     * @return
     */
    Integer getUserCountService(String userName,Integer userRole);

    /**
     * 插入用户
     * @param user
     * @return
     */
    Integer addUserListService(User user);

    /**
     * 插入
     * @param user
     * @return
     */
    Integer insertUserListService(User user);

    /**
     * 查询用户信息通过id
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 通过ID删除
     * @param id
     * @return
     */
    Integer deleteByIdService(Integer id);

    /**
     * 用户修改密码
     * @param id
     * @return
     */
    Integer modifyUserPasswordService(String userPassword,Integer id);
}