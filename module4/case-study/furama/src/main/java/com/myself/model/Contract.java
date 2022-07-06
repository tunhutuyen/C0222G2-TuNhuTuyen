//package com.myself.model;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Contract {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_contract")
//    private Integer idContract;
//    @Column(columnDefinition = "DATETIME")
//    private String startDate;
//    @Column(columnDefinition = "DATETIME")
//    private String endDate;
//    private Double deposit;
//    @ManyToOne
//    @JoinColumn(name = "id_employee")
//    private Employee employee;
//    @ManyToOne
//    @JoinColumn(name = "id_customer")
//    private Customer customer;
//    @ManyToOne
//    @JoinColumn(name = "id_facility")
//    private Facility facility;
//    @OneToMany(mappedBy = "contract")
//    private List<Contract> contractList;
//
//    public Contract() {
//    }
//
//    public Contract(Integer idContract, String startDate, String endDate, Double deposit, Employee employee, Customer customer, Facility facility, List<Contract> contractList) {
//        this.idContract = idContract;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.deposit = deposit;
//        this.employee = employee;
//        this.customer = customer;
//        this.facility = facility;
//        this.contractList = contractList;
//    }
//
//    public Integer getIdContract() {
//        return idContract;
//    }
//
//    public void setIdContract(Integer idContract) {
//        this.idContract = idContract;
//    }
//
//    public String getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(String startDate) {
//        this.startDate = startDate;
//    }
//
//    public String getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }
//
//    public Double getDeposit() {
//        return deposit;
//    }
//
//    public void setDeposit(Double deposit) {
//        this.deposit = deposit;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public Facility getFacility() {
//        return facility;
//    }
//
//    public void setFacility(Facility facility) {
//        this.facility = facility;
//    }
//
//    public List<Contract> getContractList() {
//        return contractList;
//    }
//
//    public void setContractList(List<Contract> contractList) {
//        this.contractList = contractList;
//    }
//}
