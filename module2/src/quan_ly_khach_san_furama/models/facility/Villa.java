package quan_ly_khach_san_furama.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private Double areaPool;
    private Integer numberFloor;

    public Villa() {
    }

    public Villa(String roomStandard, Double areaPool, Integer numberFloor) {
        super();
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String idService, String nameService,Double areaUser ,Double costRental, Integer personMaximum, String typeRental, String roomStandard, Double areaPool, Integer numberFloor) {
        super(idService, nameService,areaUser ,costRental, personMaximum, typeRental);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    public Integer getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(Integer numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                ";roomStandard: " + roomStandard +
                "; areaPool: " + areaPool +
                "; numberFloor: " + numberFloor;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+";" + roomStandard + ";" + areaPool + ";" + numberFloor;
    }
}
