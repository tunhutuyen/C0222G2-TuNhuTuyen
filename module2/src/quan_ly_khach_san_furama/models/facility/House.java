package quan_ly_khach_san_furama.models.facility;

import java.util.Objects;

public class House extends Facility {
    private String roomStandard;
    private Integer numFloor;

    public House() {
    }

    public House(String roomStandard, Integer numFloor) {
        this.roomStandard = roomStandard;
        this.numFloor = numFloor;
    }

    public House(String idService, String nameService,Double areaUser , Double costRental, Integer personMaximum, String typeRental, String roomStandard, Integer numFloor) {
        super(idService, nameService, areaUser,costRental, personMaximum, typeRental);
        this.roomStandard = roomStandard;
        this.numFloor = numFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(Integer numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "House- " +super.toString()+
                ";roomStandard:" + roomStandard +
                "; numFloor:" + numFloor;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+";" + roomStandard + ";" + numFloor;
    }
}
