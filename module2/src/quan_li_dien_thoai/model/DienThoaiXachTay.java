package quan_li_dien_thoai.model;

public class DienThoaiXachTay extends DienThoai {
    private String nationalHandle;
    private String status;
    private static final String COMMON = ",";

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(String nationalHandle, String status) {
        this.nationalHandle = nationalHandle;
        this.status = status;
    }

    public DienThoaiXachTay(Integer id, String name, Double price, Integer number, String manufacturer, String nationalHandle, String status) {
        super(id, name, price, number, manufacturer);
        this.nationalHandle = nationalHandle;
        this.status = status;
    }

    public String getNationalHandle() {
        return nationalHandle;
    }

    public void setNationalHandle(String nationalHandle) {
        this.nationalHandle = nationalHandle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" + super.toString() +
                "nationalHandle='" + nationalHandle +
                ", status='" + status +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + COMMON + nationalHandle + COMMON + status;
    }
}
