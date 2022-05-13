package quan_li_dien_thoai.model;

public class DienThoaiChinhHang extends DienThoai {
    private String timeInsurance;
    private String rangeInsurance;
    private static final String COMMON = ",";

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String timeInsurance, String rangeInsurance) {
        this.timeInsurance = timeInsurance;
        this.rangeInsurance = rangeInsurance;
    }

    public DienThoaiChinhHang(Integer id, String name, Double price, Integer number, String manufacturer, String timeInsurance, String rangeInsurance) {
        super(id, name, price, number, manufacturer);
        this.timeInsurance = timeInsurance;
        this.rangeInsurance = rangeInsurance;
    }

    public String getTimeInsurance() {
        return timeInsurance;
    }

    public void setTimeInsurance(String timeInsurance) {
        this.timeInsurance = timeInsurance;
    }


    public String getRangeInsurance() {
        return rangeInsurance;
    }

    public void setRangeInsurance(String rangeInsurance) {
        this.rangeInsurance = rangeInsurance;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" + super.toString() +
                ",timeInsurance" + timeInsurance +
                ", rangeInsurance='" + rangeInsurance + '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + COMMON + timeInsurance + COMMON + rangeInsurance;
    }
}
