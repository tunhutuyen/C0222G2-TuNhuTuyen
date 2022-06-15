package model;

public class Position {
    private Integer idPosition;
    private String namePosition;
    private Integer statusPosition;

    public Position() {
    }

    public Position(Integer idPosition, String namePosition) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
    }


    public Position(Integer idPosition, String namePosition, Integer statusPosition) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.statusPosition = statusPosition;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public Integer getStatusPosition() {
        return statusPosition;
    }

    public void setStatusPosition(Integer statusPosition) {
        this.statusPosition = statusPosition;
    }
}
