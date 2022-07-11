package com.myself.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.myself.model.ContractDetail;
import com.myself.model.Customer;
import com.myself.model.Employee;
import com.myself.model.Facility;

import javax.persistence.*;
import java.util.List;

public class ContractDto {
    private Integer idContract;
    private String startDate;
    private String endDate;
    private Double deposit;
    private Employee employee;
    private Customer customer;
    private Facility facility;
    private List<ContractDetail> contractDetailList;
    private Double totalMoney;

    public ContractDto() {
    }

    public ContractDto(Integer idContract, String startDate, String endDate, Double deposit, Employee employee, Customer customer, Facility facility, List<ContractDetail> contractDetailList, Double totalMoney) {
        this.idContract = idContract;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.contractDetailList = contractDetailList;
        this.totalMoney = totalMoney;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
