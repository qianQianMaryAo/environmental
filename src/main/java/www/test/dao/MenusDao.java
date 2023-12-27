package www.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.test.pojo.Menus;
import www.test.pojo.Role;
import www.test.pojo.WaterRecord;

import java.util.List;

@Repository
public interface MenusDao {
    /**
     * 通过ID获取当前用户可访问页面
     * @param roleId
     * @return
     */
    //用户页面权限
    List<Menus> getManagementDao(Integer roleId);

    /**
     * 用户列表及条件查询
     * @param roleName
     * @param creationBy
     * @return
     */
    List<Role> getRoleList(@Param("roleName") String roleName,@Param("creationBy")  String creationBy);

    /**
     * 插入用户角色
     * @param role
     * @return
     */
    Integer addMenusList(Role role);

    /**
     * 修改用户角色
     * @param role
     * @return
     */
    Integer modifyMenusList(Role role);



}
