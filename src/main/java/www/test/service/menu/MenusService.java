package www.test.service.menu;

import www.test.pojo.Menus;
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
}
