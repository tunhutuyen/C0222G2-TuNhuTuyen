package quan_ly_khach_san_furama.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idService, String nameService,Double areaUser ,Double costRental, Integer personMaximum, String typeRental, String freeService) {
        super(idService, nameService,areaUser ,costRental, personMaximum, typeRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{ " +super.toString()+
                ";freeService='" + freeService + '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo()+";" + freeService;
    }
}
