package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.Role;

import java.util.List;

@Repository
public interface RoleDao {
    List<Role> getRoleListDao();
}
