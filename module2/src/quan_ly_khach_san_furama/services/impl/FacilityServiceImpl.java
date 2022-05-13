package quan_ly_khach_san_furama.services.impl;

import quan_ly_khach_san_furama.common.CheckRegex;
import quan_ly_khach_san_furama.common.ReadAndWrite;
import quan_ly_khach_san_furama.models.facility.Facility;
import quan_ly_khach_san_furama.models.facility.House;
import quan_ly_khach_san_furama.models.facility.Room;
import quan_ly_khach_san_furama.models.facility.Villa;
import quan_ly_khach_san_furama.services.IFacilityService;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    private static List<Facility> maintenanceFacilityList = new ArrayList<>();
    private static List<House> houseList;
    private static List<Villa> villaList;
    private static List<Room> roomList;

    static {
        facilityMap.put(new Room("SVRO-1234", "vina-house", 50.0, 1200000.0, 2, "Today", "shower free"), 4);
//        facilityMap.put(new Villa("SVVL-1234", "vina-house", 45.0, 1200000.0, 2, "month", "normal", 30.0, 3), 4);
//        facilityMap.put(new House("SVHO-0000", "vina-house", 50.0, 1500000.0, 4, "Today", "Vip", 2), 4);
        roomList = ReadAndWrite.readFileCsvToListRoom();
        houseList = ReadAndWrite.readFileCsvToListHouse();
        villaList = ReadAndWrite.readFileCsvToListVilla();

    }

    private void checkMaintenance(Facility facility) {
        if (facilityMap.get(facility) >= 5) {
            System.out.println("Đang bảo trì");
            maintenanceFacilityList.add(facility);
            facilityMap.put(facility, 0);
        }
    }

    @Override
    public void addFacility(Facility facility) {
        Set<Facility> facilitySet = facilityMap.keySet();
        if (facilityMap.isEmpty()) {
            facilityMap.put(facility, 1);
        } else {
            boolean flag = true;
            for (Facility facilityKey : facilitySet) {
                if (facility.equals(facilityKey)) {
                    checkMaintenance(facilityKey);
                    facilityMap.put(facilityKey, facilityMap.get(facilityKey) + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                facilityMap.put(facility, 1);
            }
        }
    }

    @Override
    public void addVilla() {
        //villaList = ReadAndWrite.readFileCsvToListVilla();
        String id = CheckRegex.isREGEX_IDSERVICEVILLA();

        String name = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        System.out.println("Nhập diện tích >30: ");
        String areaUse = scanner.nextLine();
        while (!CheckRegex.isREGEX_AREAUSE_AND_AREAPOOL(areaUse) || areaUse.equals("30")) {
            System.out.println("Sai!!! Nhập lại diện tích: ");
            areaUse = scanner.nextLine();
        }
        Double areaUseNew = Double.parseDouble(areaUse);

        String cost = CheckRegex.isREGEX_COSTRETAL();
        Double costNew = Double.parseDouble(cost);


        String member = CheckRegex.isREGEX_NUMBERMEMBER();
        Integer memberNew = Integer.parseInt(member);

        String typeRental = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        String roomStand = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        System.out.println("nhập diện tích hồ bơi >30:");
        String areaPool = scanner.nextLine();
        while (!CheckRegex.isREGEX_AREAUSE_AND_AREAPOOL(areaPool) || areaPool.equals("30")) {
            System.out.println("Sai!!! Nhập lại diện tích: ");
            areaPool = scanner.nextLine();
        }
        Double areaPoolNew = Double.parseDouble(areaPool);

        String numberFloor = CheckRegex.isREGEX_NUMBERFLOOR();
        Integer numberFloorNew = Integer.parseInt(numberFloor);

        Villa villa = new Villa(id, name, areaUseNew, costNew, memberNew, typeRental, roomStand, areaPoolNew, numberFloorNew);
        villaList.add(villa);
        ReadAndWrite.writeVillaToCsv(villaList, false);
        this.addFacility(villa);
        System.out.println("thêm thành công");
    }

    @Override
    public void addHouse() {
        //houseList = ReadAndWrite.readFileCsvToListHouse();
        String id = CheckRegex.isREGEX_IDSERVICEHOUSE();

        String name = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        System.out.println("Nhập diện tích >30: ");
        String areaUse = scanner.nextLine();
        while (!CheckRegex.isREGEX_AREAUSE_AND_AREAPOOL(areaUse) || areaUse.equals("30")) {
            System.out.println("Sai!!! Nhập lại diện tích: ");
            areaUse = scanner.nextLine();
        }
        Double areaUseNew = Double.parseDouble(areaUse);

        String cost = CheckRegex.isREGEX_COSTRETAL();
        Double costNew = Double.parseDouble(cost);

        String member = CheckRegex.isREGEX_NUMBERMEMBER();
        Integer memberNew = Integer.parseInt(member);

        String typeRental = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        String roomStandard = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        String numberFloor = CheckRegex.isREGEX_NUMBERFLOOR();
        Integer numberFloorNew = Integer.parseInt(numberFloor);

        House house = new House(id, name, areaUseNew, costNew, memberNew, typeRental, roomStandard, numberFloorNew);
        houseList.add(house);
        ReadAndWrite.writeHouseToCsv(houseList, false);
        addFacility(house);
        System.out.println("thêm thành công");
    }

    @Override
    public void addRoom() {
        //roomList = ReadAndWrite.readFileCsvToListRoom();
        String id = CheckRegex.isREGEX_IDSERVICEROOM();

        String name = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        System.out.println("Nhập diện tích >30: ");
        String areaUse = scanner.nextLine();
        while (!CheckRegex.isREGEX_AREAUSE_AND_AREAPOOL(areaUse) || areaUse.equals("30")) {
            System.out.println("Sai!!! Nhập lại diện tích: ");
            areaUse = scanner.nextLine();
        }
        Double areaUseNew = Double.parseDouble(areaUse);

        String cost = CheckRegex.isREGEX_COSTRETAL();
        Double costNew = Double.parseDouble(cost);

        String member = CheckRegex.isREGEX_NUMBERMEMBER();
        Integer memberNew = Integer.parseInt(member);

        String typeRental = CheckRegex.isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD();

        System.out.println("nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();

        Room room = new Room(id, name, areaUseNew, costNew, memberNew, typeRental, freeService);
        roomList.add(room);
        ReadAndWrite.writeRoomToCsv(roomList, false);
        addFacility(room);
        System.out.println("thêm thành công");
    }

    @Override
    public void display() {
        for (House house:houseList) {
            System.out.println(house);
        }
        for (Villa villa:villaList) {
            System.out.println(villa);
        }
        for (Room room:roomList) {
            System.out.println(room);
        }
    }

    @Override
    public void displayListMaintenance() {
        if (!maintenanceFacilityList.isEmpty()) {
            for (Facility maintenance : maintenanceFacilityList) {
                System.out.println(maintenance);
            }
        } else {
            System.out.println("Chưa có bảo trì");
        }
    }
    public void displayFacilityList(){
        for (Map.Entry<Facility,Integer> entry:facilityMap.entrySet()){
            System.out.println(entry.getKey().toString() + ";" + entry.getValue());
        }
    }
}
