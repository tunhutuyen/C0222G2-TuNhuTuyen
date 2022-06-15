package model;

public class EducationDegree {
    private Integer idDegree;
    private String nameDegree;
    private Integer statusDegree;

    public EducationDegree() {
    }

    public EducationDegree(Integer idDegree, String nameDegree) {
        this.idDegree = idDegree;
        this.nameDegree = nameDegree;
    }

    public EducationDegree(Integer idDegree, String nameDegree, Integer statusDegree) {
        this.idDegree = idDegree;
        this.nameDegree = nameDegree;
        this.statusDegree = statusDegree;
    }

    public Integer getIdDegree() {
        return idDegree;
    }

    public void setIdDegree(Integer idDegree) {
        this.idDegree = idDegree;
    }

    public String getNameDegree() {
        return nameDegree;
    }

    public void setNameDegree(String nameDegree) {
        this.nameDegree = nameDegree;
    }

    public Integer getStatusDegree() {
        return statusDegree;
    }

    public void setStatusDegree(Integer statusDegree) {
        this.statusDegree = statusDegree;
    }
}
