package www.test.pojo;

import java.util.Date;

public class Trouble {
    private Integer id;
    private Date troubleDte;
    private String contents;
    private String cause;
    private String recorder;
    private Date solutionDate;

    @Override
    public String toString() {
        return "Trouble{" +
                "id=" + id +
                ", troubleDte=" + troubleDte +
                ", contents='" + contents + '\'' +
                ", cause='" + cause + '\'' +
                ", recorder='" + recorder + '\'' +
                ", solutionDate=" + solutionDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTroubleDte() {
        return troubleDte;
    }

    public void setTroubleDte(Date troubleDte) {
        this.troubleDte = troubleDte;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public Date getSolutionDate() {
        return solutionDate;
    }

    public void setSolutionDate(Date solutionDate) {
        this.solutionDate = solutionDate;
    }
}
