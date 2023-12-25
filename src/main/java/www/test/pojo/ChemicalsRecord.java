package www.test.pojo;

public class ChemicalsRecord {
    private Integer id;
    private String recordDate;
    private Integer carbonSource;
    private Integer cPurchase;
    private Integer cUse;
    private Integer cSurplus;
    private Integer pac;
    private Integer aPurchase;
    private Integer aUse;
    private Integer aSurplus;
    private Integer pam;
    private Integer mPurchase;
    private Integer mUse;
    private Integer mSurplus;

    @Override
    public String toString() {
        return "ChemicalsRecord{" +
                "id=" + id +
                ", recordDate='" + recordDate + '\'' +
                ", carbonSource=" + carbonSource +
                ", cPurchase=" + cPurchase +
                ", cUse=" + cUse +
                ", cSurplus=" + cSurplus +
                ", pac=" + pac +
                ", aPurchase=" + aPurchase +
                ", aUse=" + aUse +
                ", aSurplus=" + aSurplus +
                ", pam=" + pam +
                ", mPurchase=" + mPurchase +
                ", mUse=" + mUse +
                ", mSurplus=" + mSurplus +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public Integer getCarbonSource() {
        return carbonSource;
    }

    public void setCarbonSource(Integer carbonSource) {
        this.carbonSource = carbonSource;
    }

    public Integer getcPurchase() {
        return cPurchase;
    }

    public void setcPurchase(Integer cPurchase) {
        this.cPurchase = cPurchase;
    }

    public Integer getcUse() {
        return cUse;
    }

    public void setcUse(Integer cUse) {
        this.cUse = cUse;
    }

    public Integer getcSurplus() {
        return cSurplus;
    }

    public void setcSurplus(Integer cSurplus) {
        this.cSurplus = cSurplus;
    }

    public Integer getPac() {
        return pac;
    }

    public void setPac(Integer pac) {
        this.pac = pac;
    }

    public Integer getaPurchase() {
        return aPurchase;
    }

    public void setaPurchase(Integer aPurchase) {
        this.aPurchase = aPurchase;
    }

    public Integer getaUse() {
        return aUse;
    }

    public void setaUse(Integer aUse) {
        this.aUse = aUse;
    }

    public Integer getaSurplus() {
        return aSurplus;
    }

    public void setaSurplus(Integer aSurplus) {
        this.aSurplus = aSurplus;
    }

    public Integer getPam() {
        return pam;
    }

    public void setPam(Integer pam) {
        this.pam = pam;
    }

    public Integer getmPurchase() {
        return mPurchase;
    }

    public void setmPurchase(Integer mPurchase) {
        this.mPurchase = mPurchase;
    }

    public Integer getmUse() {
        return mUse;
    }

    public void setmUse(Integer mUse) {
        this.mUse = mUse;
    }

    public Integer getmSurplus() {
        return mSurplus;
    }

    public void setmSurplus(Integer mSurplus) {
        this.mSurplus = mSurplus;
    }
}
