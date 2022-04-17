package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Motorcycle;

import java.util.ArrayList;

public class VehicleOfService implements VehicleOfServiceImpl{
    ArrayList<Motorcycle> arrMotorcycles = new ArrayList<>();
    @Override
    public void themMoi() {
        System.out.println("ok");
    }

    @Override
    public void suaDoi() {
        System.out.println("sua ok");
    }

    @Override
    public void xoa() {
        System.out.println("xoa ok");
    }

    @Override
    public void hienThi() {
        System.out.println("hien thi ok");
    }
}
