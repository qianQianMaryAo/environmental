package www.test.pojo;

public class Menus {
    private Integer id;
    private String menuCode;
    private String menuDesc;

    @Override
    public String toString() {
        return "Menus{" +
                "id=" + id +
                ", menuCode='" + menuCode + '\'' +
                ", menuDesc='" + menuDesc + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }
}
