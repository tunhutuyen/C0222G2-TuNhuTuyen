package quan_ly_khach_san_furama.models;

public abstract class Facility {
    private String idService;
    private String nameService;
    private Double costRental;
    private Integer personMaximum;
    private String typeRental;

    public Facility() {
    }

    public Facility(String idService, String nameService, Double costRental, Integer personMaximum, String typeRental) {
        this.idService = idService;
        this.nameService = nameService;
        this.costRental = costRental;
        this.personMaximum = personMaximum;
        this.typeRental = typeRental;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getCostRental() {
        return costRental;
    }

    public void setCostRental(Double costRental) {
        this.costRental = costRental;
    }

    public Integer getPersonMaximum() {
        return personMaximum;
    }

    public void setPersonMaximum(Integer personMaximum) {
        this.personMaximum = personMaximum;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Facility" +
                "idService: " + idService +
                ", nameService: " + nameService  +
                ", costRental: " + costRental +
                ", personMaximum: " + personMaximum +
                ", typeRental: " + typeRental;
    }
}
