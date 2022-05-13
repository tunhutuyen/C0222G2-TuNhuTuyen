package quan_li_dien_thoai.model;

public abstract class DienThoai {
    private Integer id;
    private String name;
    private Double price;
    private Integer number;
    private String manufacturer;
    private static final String COMMON =",";

    public DienThoai() {
    }

    public DienThoai(Integer id, String name, Double price, Integer number, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public String getInfo() {
        return id + COMMON + name + COMMON + price + COMMON + number+ COMMON+ manufacturer;
    }
}
