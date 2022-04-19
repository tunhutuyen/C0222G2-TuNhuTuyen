package ss12_java_collection_framwork.bai_tap.controller;

import ss12_java_collection_framwork.bai_tap.Product;
import ss12_java_collection_framwork.bai_tap.ProductManager;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();

    public void display(){
        boolean flag =true;
        while (flag){
            System.out.println("chào mừng bạn đến hệ thống mua quản lý sản phẩm");
            System.out.println("chọn chức năng: \n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Tìm kiếm sản phẩm theo tên(gần đúng)\n" +
                    "7. Sắp xếp sản phẩm tăng dần theo giá \n" +
                    "8. Sắp xếp giảm dần theo giá \n"+
                    "0. Thoát \n");
            System.out.println("Nhập lựa chọn: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    productManager.addProduct();
                    productManager.displayProduct();
                    break;
                case "2":
                    productManager.editProduct();
                    productManager.displayProduct();
                case "3":
                    productManager.deleteProduct();
                    productManager.displayProduct();
                    break;
                case "4":
                    productManager.displayProduct();
                    break;
                case "5":
                    System.out.println("Tìm theo tên đúng: ");
                    productManager.searchName();
                case "6":
                    System.out.println("Tìm theo tên gần đúng: ");
                    productManager.searchApproximately();
                case "7":
                    System.out.println("Danh sách sau sắp xếp tăng dần: ");
                    productManager.priceSortAscending();
                    productManager.displayProduct();
                    break;
                case "8":
                    System.out.println("Danh sách sau sắp xếp giảm dần: ");
                    productManager.priceSortDecrease();
                    productManager.displayProduct();
                case "0":
                    flag = false;
                    System.out.println("kết thúc chương trình!!!");
                    break;
                default:
                    System.out.println("Xin nhập đúng");
                    break;
            }

        }
    }
}
