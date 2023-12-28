package www.test.service.menu;

import org.apache.ibatis.annotations.Param;
import www.test.pojo.Menus;
import www.test.pojo.MenusRole;
import www.test.pojo.Role;

import java.util.List;

public interface MenusService {
    /**
     * 通过id获取用户信息
     * @param roleId
     * @return
     */
    List<Menus> getUserManagementService(Integer roleId);
    /**
     *
     * @param roleName
     * @param creationBy
     * @return
     */
    List<Role> getRoleListService(String roleName, String creationBy);

    /**
     * 插入角色
     * @param role
     * @return
     */
    Integer addMenusListService(Role role);

    /**
     * 修改用户角色
     * @param role
     * @return
     */
    Integer modifyMenusListService(Role role);
    /**
     * 查找所有菜单
     */
    List<Menus> selectAllService();
    /**
     * 删除
     * @param roleId
     * @param menuId
     * @return
     */
    Integer deleteByIdService(Integer roleId,  Integer menuId);

    /**
     * 通过ID插入
     * @param roleId
     * @param menuId
     * @return
     */
    Integer insetByIdService( Integer roleId, Integer menuId);
}
