package www.test.dao;

import org.springframework.stereotype.Repository;
import www.test.pojo.Menus;

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
}
