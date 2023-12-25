package www.test.pojo;

public class Final {
    private Integer id;
    private String projectName;
    private String technologyName;
    private Integer sewageQuality;
    private Integer hrt;
    private Integer externalRatio;
    private Integer internalRatio;
    private Integer designCOD;
    private Integer designTN;
    private Integer designNH3N;
    private Integer designTP;

    @Override
    public String toString() {
        return "Final{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", technologyName='" + technologyName + '\'' +
                ", sewageQuality=" + sewageQuality +
                ", hrt=" + hrt +
                ", externalRatio=" + externalRatio +
                ", internalRatio=" + internalRatio +
                ", designCOD=" + designCOD +
                ", designTN=" + designTN +
                ", designNH3N=" + designNH3N +
                ", designTP=" + designTP +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public Integer getSewageQuality() {
        return sewageQuality;
    }

    public void setSewageQuality(Integer sewageQuality) {
        this.sewageQuality = sewageQuality;
    }

    public Integer getHrt() {
        return hrt;
    }

    public void setHrt(Integer hrt) {
        this.hrt = hrt;
    }

    public Integer getExternalRatio() {
        return externalRatio;
    }

    public void setExternalRatio(Integer externalRatio) {
        this.externalRatio = externalRatio;
    }

    public Integer getInternalRatio() {
        return internalRatio;
    }

    public void setInternalRatio(Integer internalRatio) {
        this.internalRatio = internalRatio;
    }

    public Integer getDesignCOD() {
        return designCOD;
    }

    public void setDesignCOD(Integer designCOD) {
        this.designCOD = designCOD;
    }

    public Integer getDesignTN() {
        return designTN;
    }

    public void setDesignTN(Integer designTN) {
        this.designTN = designTN;
    }

    public Integer getDesignNH3N() {
        return designNH3N;
    }

    public void setDesignNH3N(Integer designNH3N) {
        this.designNH3N = designNH3N;
    }

    public Integer getDesignTP() {
        return designTP;
    }

    public void setDesignTP(Integer designTP) {
        this.designTP = designTP;
    }
}
