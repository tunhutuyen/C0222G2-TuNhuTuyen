package quan_ly_khach_san_furama.models.person;

public class Customer extends Person {
    private String typeMember;
    private String address;

    public Customer() {
    }

    public Customer(String typeMember, String address) {
        this.typeMember = typeMember;
        this.address = address;
    }

    public Customer(Integer id, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeMember, String address) {
        super(id, name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.typeMember = typeMember;
        this.address = address;
    }

    public String getTypeMember() {
        return typeMember;
    }

    public void setTypeMember(String typeMember) {
        this.typeMember = typeMember;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeMember: " + typeMember +
                ", address: " + address;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+";" + typeMember + ";" + address;
    }
}
