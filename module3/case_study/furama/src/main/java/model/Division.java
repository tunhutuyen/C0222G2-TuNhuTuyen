package model;

public class Division {
    private Integer idDivision;
    private String nameDivision;
    private Integer statusDivision;

    public Division() {
    }

    public Division(Integer idDivision, String nameDivision) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
    }

    public Division(Integer idDivision, String nameDivision, Integer statusDivision) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
        this.statusDivision = statusDivision;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public Integer getStatusDivision() {
        return statusDivision;
    }

    public void setStatusDivision(Integer statusDivision) {
        this.statusDivision = statusDivision;
    }
}
