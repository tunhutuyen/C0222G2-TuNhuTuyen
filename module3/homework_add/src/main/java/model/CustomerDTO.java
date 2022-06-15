package model;

public class CustomerDTO {
    private String idCustomer;
    private String nameCustomer;
    private String dateCustomer;
    private String genderCustomer;
    private double giaCa;
    private String emailCustomer;
    private String moneyCustomer;
    private String nameTypeCustomer;

    public CustomerDTO() {
    }

    public CustomerDTO(String idCustomer, String nameCustomer, String dateCustomer, String genderCustomer, double giaCa, String emailCustomer, String moneyCustomer, String nameTypeCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateCustomer = dateCustomer;
        this.genderCustomer = genderCustomer;
        this.giaCa = giaCa;
        this.emailCustomer = emailCustomer;
        this.moneyCustomer = moneyCustomer;
        this.nameTypeCustomer = nameTypeCustomer;
    }

    public double getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(double giaCa) {
        this.giaCa = giaCa;
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

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }
}
