package www.test.pojo;

public class WaterRecordDTO extends  WaterRecord {
    private String testTimeDTO;
    private String uploadTimeDTO;

    @Override
    public String toString() {
        return "WaterRecordDTO{" +
                "testTime='" + testTimeDTO + '\'' +
                ", uploadTime='" + uploadTimeDTO + '\'' +
                '}';
    }

    public String getTestTimeDTO() {
        return testTimeDTO;
    }

    public void setTestTimeDTO(String testTimeDTO) {
        this.testTimeDTO = testTimeDTO;
    }

    public String getUploadTimeDTO() {
        return uploadTimeDTO;
    }

    public void setUploadTimeDTO(String uploadTimeDTO) {
        this.uploadTimeDTO = uploadTimeDTO;
    }
}
