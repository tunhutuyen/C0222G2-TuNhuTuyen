package quan_ly_khach_san_furama.services;

import quan_ly_khach_san_furama.models.facility.Facility;

public interface IFacilityService {
    void addFacility(Facility facility);
    void addVilla();
    void addHouse();
    void addRoom();
    void display();
    void displayListMaintenance();
    void displayFacilityList();
}
