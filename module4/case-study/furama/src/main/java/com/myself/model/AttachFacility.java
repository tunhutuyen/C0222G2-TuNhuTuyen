//package com.myself.model;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class AttachFacility {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_attach_facility")
//    private Integer idAttachFacility;
//    private String nameAttachFacility;
//    private Double cost;
//    private String unit;
//    private String statusAttachFacility;
//    @OneToMany(mappedBy = "attachFacility")
//    private List<ContractDetail> contractDetailList;
//
//    public AttachFacility() {
//    }
//
//    public AttachFacility(Integer idAttachFacility, String nameAttachFacility, Double cost, String unit, String statusAttachFacility, List<ContractDetail> contractDetailList) {
//        this.idAttachFacility = idAttachFacility;
//        this.nameAttachFacility = nameAttachFacility;
//        this.cost = cost;
//        this.unit = unit;
//        this.statusAttachFacility = statusAttachFacility;
//        this.contractDetailList = contractDetailList;
//    }
//
//    public Integer getIdAttachFacility() {
//        return idAttachFacility;
//    }
//
//    public void setIdAttachFacility(Integer idAttachFacility) {
//        this.idAttachFacility = idAttachFacility;
//    }
//
//    public String getNameAttachFacility() {
//        return nameAttachFacility;
//    }
//
//    public void setNameAttachFacility(String nameAttachFacility) {
//        this.nameAttachFacility = nameAttachFacility;
//    }
//
//    public Double getCost() {
//        return cost;
//    }
//
//    public void setCost(Double cost) {
//        this.cost = cost;
//    }
//
//    public String getUnit() {
//        return unit;
//    }
//
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }
//
//    public String getStatusAttachFacility() {
//        return statusAttachFacility;
//    }
//
//    public void setStatusAttachFacility(String statusAttachFacility) {
//        this.statusAttachFacility = statusAttachFacility;
//    }
//
//    public List<ContractDetail> getContractDetailList() {
//        return contractDetailList;
//    }
//
//    public void setContractDetailList(List<ContractDetail> contractDetailList) {
//        this.contractDetailList = contractDetailList;
//    }
//}
