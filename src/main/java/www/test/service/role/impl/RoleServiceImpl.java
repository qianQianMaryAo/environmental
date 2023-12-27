package www.test.service.role.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.RoleDao;
import www.test.pojo.Role;
import www.test.service.role.RoleService;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    /**
     * 获取用户列表
     * @return
     */
    @Override
    public List<Role> getRoleListService() {
        return roleDao.getRoleListDao();
    }

    @Override
    public Role getRoleListByIdService(Integer id) {
        return roleDao.getRoleListById(id);
    }

    @Override
    public Integer deleteByIdService(Integer id) {
        return roleDao.deleteById(id);
    }
}
