package www.test.service.role;

import www.test.pojo.Role;

import java.util.List;

public interface RoleService {
    /**
     * 获取用户角色
     * @return
     */
    List<Role> getRoleListService();

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    Role getRoleListByIdService(Integer id);
    /**
     * 通过ID删除
     * @param id
     * @return
     */
    Integer deleteByIdService(Integer id);
}
