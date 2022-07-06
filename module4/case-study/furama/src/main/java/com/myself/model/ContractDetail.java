//package com.myself.model;
//
//import javax.persistence.*;
//
//@Entity
//public class ContractDetail {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_contract_detail")
//    private Integer idContractDetail;
//    private Integer quantity;
//    @ManyToOne
//    @JoinColumn(name = "id_attach_facility")
//    private AttachFacility attachFacility;
//    @ManyToOne
//    @JoinColumn(name = "id_contract")
//    private Contract contract;
//
//    public ContractDetail() {
//    }
//
//    public ContractDetail(Integer idContractDetail, Integer quantity, AttachFacility attachFacility, Contract contract) {
//        this.idContractDetail = idContractDetail;
//        this.quantity = quantity;
//        this.attachFacility = attachFacility;
//        this.contract = contract;
//    }
//
//    public Integer getIdContractDetail() {
//        return idContractDetail;
//    }
//
//    public void setIdContractDetail(Integer idContractDetail) {
//        this.idContractDetail = idContractDetail;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public AttachFacility getAttachFacility() {
//        return attachFacility;
//    }
//
//    public void setAttachFacility(AttachFacility attachFacility) {
//        this.attachFacility = attachFacility;
//    }
//
//    public Contract getContract() {
//        return contract;
//    }
//
//    public void setContract(Contract contract) {
//        this.contract = contract;
//    }
//}
