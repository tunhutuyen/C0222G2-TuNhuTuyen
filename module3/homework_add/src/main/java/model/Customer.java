package model;

public class Customer {
    private String idCustomer;
    private String nameCustomer;
    private String dateCustomer;
    private String genderCustomer;
    private String emailCustomer;
    private String moneyCustomer;
    private String status;

    public Customer() {
    }

    public Customer(String idCustomer, String nameCustomer, String dateCustomer, String genderCustomer, String emailCustomer, String moneyCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateCustomer = dateCustomer;
        this.genderCustomer = genderCustomer;
        this.emailCustomer = emailCustomer;
        this.moneyCustomer = moneyCustomer;
    }

    public Customer(String nameCustomer, String dateCustomer, String genderCustomer, String emailCustomer, String moneyCustomer) {
        this.nameCustomer = nameCustomer;
        this.dateCustomer = dateCustomer;
        this.genderCustomer = genderCustomer;
        this.emailCustomer = emailCustomer;
        this.moneyCustomer = moneyCustomer;
    }

    public Customer(String idCustomer, String nameCustomer, String dateCustomer, String genderCustomer, String emailCustomer, String moneyCustomer, String status) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateCustomer = dateCustomer;
        this.genderCustomer = genderCustomer;
        this.emailCustomer = emailCustomer;
        this.moneyCustomer = moneyCustomer;
        this.status = status;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateCustomer() {
        return dateCustomer;
    }

    public void setDateCustomer(String dateCustomer) {
        this.dateCustomer = dateCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getMoneyCustomer() {
        return moneyCustomer;
    }

    public void setMoneyCustomer(String moneyCustomer) {
        this.moneyCustomer = moneyCustomer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
