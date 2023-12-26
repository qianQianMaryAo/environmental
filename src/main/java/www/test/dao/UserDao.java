package www.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.test.pojo.User;

import java.util.List;


@Repository
public interface UserDao {
    /**
     * 通过密码和用户名登录
     * @param userCode
     * @param password
     */
    User selectByNameAndPassword(@Param("userCode") String userCode, @Param("userPassword") String password);

    /**
     * 分页功能：获取用户总数
     * @param userName
     * @param userRole
     * @return
     */
    Integer getUserCountDao(@Param("userName") String userName,@Param("roleId") Integer userRole);
    /**
     *获取用户列表及分页
     * @param userRole
     * @param userName
     * @return
     */
    List<User> getUserListDao(@Param("userName") String userName,@Param("roleId") Integer userRole,@Param("currentPageNo") Integer currentPageNo,@Param("pageSize") Integer pageSize);

    /**
     * 插入用户
     * @param user
     * @return
     */
    Integer addUserListDao(User user);

    /**
     *插入数据
     * @param user
     * @return
     */
    Integer insertUserListDao(User user);

    /**
     * 通过id寻某一对象
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 删除ById
     * @param id
     * @return
     */
    Integer deleteById(Integer id);

    /**
     * 用户修改密码
     * @param id
     * @return
     */
    Integer modifyUserPasswordDao(@Param("userPassword") String userPassword,@Param("id")Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAll();
}
