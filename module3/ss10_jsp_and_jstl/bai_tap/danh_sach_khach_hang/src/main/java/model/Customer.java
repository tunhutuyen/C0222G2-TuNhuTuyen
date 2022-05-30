package model;

public class Customer {
    private Integer idCustomer;
    private String nameCustomer;
    private String birthDay;
    private String addressCustomer;
    private String picUrl;

    public Customer() {
    }

    public Customer( String nameCustomer, String birthDay, String addressCustomer, String picUrl) {

        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.addressCustomer = addressCustomer;
        this.picUrl = picUrl;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
