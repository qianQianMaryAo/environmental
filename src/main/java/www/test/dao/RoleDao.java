package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.Role;

import java.util.List;

@Repository
public interface RoleDao {
    List<Role> getRoleListDao();

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    Role getRoleListById(Integer id);
    /**
     * 通过ID删除
     * @param id
     * @return
     */
    Integer deleteById(Integer id);
}
