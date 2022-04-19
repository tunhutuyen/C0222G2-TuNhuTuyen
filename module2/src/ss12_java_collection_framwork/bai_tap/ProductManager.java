package ss12_java_collection_framwork.bai_tap;

import ss12_java_collection_framwork.bai_tap.service.PriceSort;
import ss12_java_collection_framwork.bai_tap.service.PriceSortDecrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager{
    private static Scanner scanner= new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add((new Product(1,"sữa rửa mặt",75000.0)));
        productList.add((new Product(2,"xà phòng",50000.0)));
        productList.add((new Product(3,"kem đánh răng",30000.0)));
        productList.add((new Product(4,"dầu gội đầu",60000.0)));
    }


    public void addProduct(){
        System.out.println("Nhập id: ");
        Integer id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product= new Product(id,name,price);
        productList.add(product);
        System.out.println("Thêm thành công!!!");
    }
    public void displayProduct(){
        System.out.println("Hiển thị danh sách sản phẩm: ");
        for (Product product: productList) {
            System.out.println(product);
        }
    }
    public void deleteProduct(){
        System.out.println("Nhập id sản phẩm muốn xóa: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            int i;
            for (i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId().equals(id)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Bạn thật sự muốn xóa: \n" +
                        "1. Yes \n" +
                        "2. No \n");
                System.out.println("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        productList.remove(productList.get(i));
                        System.out.println("Xóa thành công");
                        break;
                    case 2:
                        flag = false;
                        break;
                    default:
                        System.out.println("bạn hãy nhập lại!!!");
                        break;
                }
            }
        }
    }
    public void searchName(){
        System.out.print("nhập tên sản phẩm cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean flag = false;
        int i;
        for (i = 0; i <productList.size() ; i++) {
            if (productList.get(i).getName().equals(name)){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.print("kêt quả: "+ productList.get(i));
        }else {
            System.out.println("không tìm thấy!!!");
        }
    }
    public void priceSortAscending(){
        PriceSort productSortPrice = new PriceSort();
        Collections.sort(productList,productSortPrice);
    }
    public void priceSortDecrease(){
        PriceSortDecrease  priceSortDecrease= new PriceSortDecrease();
        Collections.sort(productList,priceSortDecrease);
    }
    public void searchApproximately(){
        String name = scanner.nextLine();
        for (int i = 0;i< productList.size();i++){
            if (productList.get(i).getName().contains(name)){
                System.out.println(productList.get(i));
            }
        }
    }
    public void editProduct(){
        System.out.println("Nhập id sản phẩm cần tìm: ");
        int idFind = Integer.parseInt(scanner.nextLine());
        boolean flag =false;
        for (Product value:productList) {
            if (value.getId()==idFind){
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá: ");
                Double price = Double.parseDouble(scanner.nextLine());
                value.setId(id);
                value.setName(name);
                value.setPrice(price);
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Edit thành công");
        }else {
            System.out.println("Không thành công");
        }
    }

}
