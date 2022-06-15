package repository.impl;


import model.MatBangDTO;
import repository.ConnectDB;
import repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepository implements IMatBangRepository {

    private SimpleDateFormat formatGetValue = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat formatSetValue = new SimpleDateFormat("yyyy-MM-dd");
    private final String FIND_ALL = " select mat_bang.id_mat_bang,mat_bang.dien_tich,mat_bang.gia_ca,mat_bang.tang,mat_bang.ngay_bat_dau, " +
            " mat_bang.ngay_ket_thuc, loai_trang_thai.ten_trang_thai,loai_mat_bang.ten_loai_mat_bang from mat_bang " +
            " join loai_trang_thai on loai_trang_thai.id_trang_thai = mat_bang.id_trang_thai " +
            " join loai_mat_bang on loai_mat_bang.id_loai_mat_bang = mat_bang.id_loai_mat_bang ";

    @Override
    public List<MatBangDTO> findMatBang() {
        List<MatBangDTO> matBangDTOS = new ArrayList<>();
        try (Connection connection = new ConnectDB().getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idMatBang = resultSet.getString("id_mat_bang");
                double dienTich = resultSet.getDouble("dien_tich");
                double giaCa = resultSet.getDouble("gia_ca");
                int tang = resultSet.getInt("tang");
                String ngayBatDau = formatGetValue.format(resultSet.getDate("ngay_bat_dau"));
                String ngayKetThuc = formatGetValue.format(resultSet.getDate("ngay_ket_thuc"));
                String tenTrangThai = resultSet.getString("ten_trang_thai");
                String tenLoaiMatBang = resultSet.getString("ten_loai_mat_bang");
//                int status = resultSet.getInt("status");
                MatBangDTO matBangDTO = new MatBangDTO(idMatBang, dienTich, giaCa, ngayBatDau, ngayKetThuc, tenLoaiMatBang, tenTrangThai, tang);
                matBangDTOS.add(matBangDTO);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return matBangDTOS;
    }
}
