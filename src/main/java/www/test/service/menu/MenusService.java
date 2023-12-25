package www.test.service.menu;

import www.test.pojo.Menus;

import java.util.List;

public interface MenusService {
    /**
     * 通过id获取用户信息
     * @param roleId
     * @return
     */
    List<Menus> getUserManagementService(Integer roleId);
}
