package com.myself.model;

import javax.persistence.*;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facility")
    private Integer idFacility;
    private String name;
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

}
