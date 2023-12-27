package www.test.service.menu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.MenusDao;
import www.test.pojo.Menus;
import www.test.pojo.Role;
import www.test.service.menu.MenusService;

import java.util.List;

@Service
public class MenusServiceImpl implements MenusService {
    @Autowired
    private MenusDao menusDao;
    @Override
    public List<Menus> getUserManagementService(Integer roleId) {
        return menusDao.getManagementDao(roleId);
    }

    @Override
    public List<Role> getRoleListService(String roleName, String creationBy) {
        return menusDao.getRoleList(roleName,creationBy);
    }

    @Override
    public Integer addMenusListService(Role role) {
        return menusDao.addMenusList(role);
    }

    @Override
    public Integer modifyMenusListService(Role role) {
        return menusDao.modifyMenusList(role);
    }
}
