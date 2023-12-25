package www.test.pojo;

public class MenusRole {
   private Integer roleId;
   private String menuId;

    @Override
    public String toString() {
        return "MenusRole{" +
                "roleId=" + roleId +
                ", menuId='" + menuId + '\'' +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
