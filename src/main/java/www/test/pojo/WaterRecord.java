package www.test.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class WaterRecord {
    private Integer id;
    private BigDecimal COD;
    private BigDecimal NH3N;
    private BigDecimal TN;
    private BigDecimal TP;
    //与数据库datetime保持一致
    private Timestamp testTime;
    private Timestamp uploadTime;
    private String uploadBy;
    private Integer roleId;

    @Override
    public String toString() {
        return "WaterRecord{" +
                "id=" + id +
                ", COD=" + COD +
                ", NH3N=" + NH3N +
                ", TN=" + TN +
                ", TP=" + TP +
                ", testTime=" + testTime +
                ", uploadTime=" + uploadTime +
                ", uploadBy='" + uploadBy + '\'' +
                ", roleId=" + roleId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCOD() {
        return COD;
    }

    public void setCOD(BigDecimal COD) {
        this.COD = COD;
    }

    public BigDecimal getNH3N() {
        return NH3N;
    }

    public void setNH3N(BigDecimal NH3N) {
        this.NH3N = NH3N;
    }

    public BigDecimal getTN() {
        return TN;
    }

    public void setTN(BigDecimal TN) {
        this.TN = TN;
    }

    public BigDecimal getTP() {
        return TP;
    }

    public void setTP(BigDecimal TP) {
        this.TP = TP;
    }

    public Timestamp getTestTime() {
        return testTime;
    }

    public void setTestTime(Timestamp testTime) {
        this.testTime = testTime;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(String uploadBy) {
        this.uploadBy = uploadBy;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
