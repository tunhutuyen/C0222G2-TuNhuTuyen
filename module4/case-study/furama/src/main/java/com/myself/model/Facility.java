package com.myself.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facility")
    private Integer idFacility;
    @Column(name = "name_facility")
    private String nameFacility;
    private Integer area;
    private Double cost;
    @Column(name = "max_people")
    private Integer maxPeople;
    @Column(name = "standard_room")
    private String standardRoom;
    @Column(name = "description_other_convenience")
    private String descriptionOtherConvenience;
    @Column(name = "pool_area")
    private Double poolArea;
    @Column(name = "number_of_floor")
    private Integer numberOfFloor;
    @Column(name = "facility_free")
    private String facilityFree;
    @ManyToOne
    @JoinColumn(name = "id_facility_type")
    private FacilityType facilityType;
    @ManyToOne
    @JoinColumn(name = "id_rent_type")
    private RentType rentType;
//    @OneToMany(mappedBy = "facility")
//    private List<Contract> contractList;

    public Facility() {
    }

    public Facility(Integer idFacility, String nameFacility, Integer area, Double cost, Integer maxPeople, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloor, String facilityFree, FacilityType facilityType, RentType rentType) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.facilityFree = facilityFree;
        this.facilityType = facilityType;
        this.rentType = rentType;
    }

//    public Facility(Integer idFacility, String nameFacility, Integer area, Double cost, Integer maxPeople, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloor, String facilityFree, FacilityType facilityType, RentType rentType, List<Contract> contractList) {
//        this.idFacility = idFacility;
//        this.nameFacility = nameFacility;
//        this.area = area;
//        this.cost = cost;
//        this.maxPeople = maxPeople;
//        this.standardRoom = standardRoom;
//        this.descriptionOtherConvenience = descriptionOtherConvenience;
//        this.poolArea = poolArea;
//        this.numberOfFloor = numberOfFloor;
//        this.facilityFree = facilityFree;
//        this.facilityType = facilityType;
//        this.rentType = rentType;
//        this.contractList = contractList;
//    }
//
//    public List<Contract> getContractList() {
//        return contractList;
//    }
//
//    public void setContractList(List<Contract> contractList) {
//        this.contractList = contractList;
//    }

    public Integer getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(Integer idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}
