package quan_ly_khach_san_furama.models.facility;

import java.util.Objects;

public abstract class Facility {
    private String idService;
    private String nameService;
    private Double areaUse;
    private Double costRental;
    private Integer personMaximum;
    private String typeRental;

    public Facility() {
    }

    public Facility(String idService, String nameService,Double areaUse, Double costRental, Integer personMaximum, String typeRental) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaUse = areaUse;
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

    public Double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(Double areaUse) {
        this.areaUse = areaUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return idService.equals(facility.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService);
    }

    @Override
    public String toString() {
        return "idService:" + idService +
                "; nameService:" + nameService +
                "; areaUse:" + areaUse +
                "; costRental:" + costRental +
                "; personMaximum:" + personMaximum +
                "; typeRental:" + typeRental;
    }
    public String getInfo(){
        return idService + ";" + nameService + ";" + areaUse + ";" + costRental + ";" + personMaximum + ";" + typeRental;
    }
}
