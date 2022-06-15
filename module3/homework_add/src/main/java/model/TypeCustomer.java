package model;

public class TypeCustomer {
    private String id_type_customer;
    private String name_type_customer;
    private String status;

    public TypeCustomer() {
    }

    public TypeCustomer(String id_type_customer, String name_type_customer) {
        this.id_type_customer = id_type_customer;
        this.name_type_customer = name_type_customer;
    }

    public TypeCustomer(String id_type_customer, String name_type_customer, String status) {
        this.id_type_customer = id_type_customer;
        this.name_type_customer = name_type_customer;
        this.status = status;
    }

    public String getId_type_customer() {
        return id_type_customer;
    }

    public void setId_type_customer(String id_type_customer) {
        this.id_type_customer = id_type_customer;
    }

    public String getName_type_customer() {
        return name_type_customer;
    }

    public void setName_type_customer(String name_type_customer) {
        this.name_type_customer = name_type_customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
