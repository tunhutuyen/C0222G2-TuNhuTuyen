package quan_ly_khach_san_furama.services.impl;

import quan_ly_khach_san_furama.common.CheckRegex;
import quan_ly_khach_san_furama.common.ReadAndWrite;
import quan_ly_khach_san_furama.models.person.Customer;
import quan_ly_khach_san_furama.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();
    //private static final String REGEX_DATE = "^((0?[1-9]|[1-2][0-9]|3[0-1])\\/((0)?[1-9]|(1)[0-2])\\/(((19)([0-9]{2}))|([2]([0-9]{3}))))$";

    static {
//        customerList.add(new Customer(3, "Thanh Nhất", "1/1/1999", "nam",
//                "K100021111", "0219485723", "tanvo@gmail.com", "rank bạc rách", "đà nẵng"));
//        customerList.add(new Customer(2, "Ngưu Tất", "20/1/1992", "nam",
//                "201412E123", "0432255723", "huthan@gmail.com", "rank đồng thau ", "hà lội"));
//        customerList.add(new Customer(5, "Hổ báo", "22/5/2000", "nam",
//                "201412E123", "0999912345", "dautrym@gmail.com", "rank kim cương ", "nam định"));

        customerList = ReadAndWrite.readFileCsvToListCustomer();
    }

    @Override
    public void displayList() {

        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {

        System.out.println("nhập mã khách hàng:");
        boolean flag = true;
        Integer id =null;
        while (flag) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng. Nhập lại");
            }
        }

        System.out.println("nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh:");
        String dateOfBirth = CheckRegex.isRegexAge(scanner.nextLine());
        System.out.println("nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập CMND: ");
        String idCard = scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập email: ");
        String email = scanner.nextLine();
        System.out.println("nhập kiểu thành viên:");
        String typeMember = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCard, phoneNumber, email, typeMember, address);
        customerList.add(customer);
        ReadAndWrite.writeCustomerToCsv(customerList,false);
        System.out.println("Thêm customer ok rồi");
    }

    @Override
    public void edit() {
        System.out.println("nhập mã khách hàng cần sửa:");
        Integer id = Integer.parseInt(scanner.nextLine());
        int i;
        boolean flag = false;
        for (i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            while (flag) {
                flag = isFlagAndChooseEdit(i, flag);
            }
        } else {
            System.out.println("Có đâu mà đòi sửa!!!");
        }
    }

    private boolean isFlagAndChooseEdit(int i, boolean flag) {
        System.out.println("nhập lựa chọn: \n" +
                "1-Mã khách hàng \n" +
                "2-Họ tên \n" +
                "3-Ngày sinh\n" +
                "4-Giới tính\n" +
                "5-Số CMND \n" +
                "6-Số Điện Thoại\n" +
                "7- Email\n" +
                "8- Kiểu khách hàng \n" +
                "9-Địa chỉ\n" +
                "10-End \n");
        System.out.println("nhập lựa chọn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("nhập mã khách hàng cần sửa:");
                Integer idEmployee = Integer.parseInt(scanner.nextLine());
                customerList.get(i).setId(idEmployee);
                System.out.println("Edit is successful!!!");
                break;
            case 2:
                System.out.println("nhập tên khách hàng:");
                String name = scanner.nextLine();
                customerList.get(i).setName(name);
                System.out.println("Edit is successful!!!");
                break;
            case 3:
                System.out.println("nhập ngày sinh:");
                String date = scanner.nextLine();
                customerList.get(i).setDateOfBirth(date);
                System.out.println("Edit is successful!!!");
                break;
            case 4:
                System.out.println("nhập giới tính: ");
                String gender = scanner.nextLine();
                customerList.get(i).setGender(gender);
                System.out.println("Edit is successful!!!");
                break;
            case 5:
                System.out.println("nhập CMND: ");
                String idCard = scanner.nextLine();
                customerList.get(i).setIdCard(idCard);
                System.out.println("Edit is successful!!!");
                break;
            case 6:
                System.out.println("nhập số điện thoại: ");
                String phoneNumber = scanner.nextLine();
                customerList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("Edit is successful!!!");
                break;
            case 7:
                System.out.println("nhập email: ");
                String email = scanner.nextLine();
                customerList.get(i).setEmail(email);
                System.out.println("Edit is successful!!!");
                break;
            case 8:
                System.out.println("nhập kiểu khách hàng: ");
                String typeMember = scanner.nextLine();
                customerList.get(i).setTypeMember(typeMember);
                System.out.println("Edit is successful!!!");
                break;
            case 9:
                System.out.println("nhập địa chỉ: ");
                String address = scanner.nextLine();
                customerList.get(i).setAddress(address);
                System.out.println("Edit is successful!!!");
                break;
            case 10:
                flag = false;
                System.out.println("End edit!!!!");
                break;
            default:
                System.out.println("nhập qq gì vậy. Nhập lại đi!!!!!!!!!!!!!!");
        }
        return flag;
    }

    public void deleteCustomer() {
        System.out.println("nhập id khách muốn xóa:");
        Integer idCustomer = Integer.parseInt(scanner.nextLine());
        int i;
        boolean flag = true;
        while (flag) {
            for (i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getId().equals(idCustomer)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Bạn thật sự muốn xóa!!!\n" +
                        "1. Yes \n" +
                        "2.No");
                System.out.println("BẠn chọn gì: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        customerList.remove(i);
                        System.out.println("Xóa xong rồi");
                        flag = false;
                        break;
                    case 2:
                        System.out.println("Méo xóa nhé");
                        break;
                    default:
                        System.out.println("Chọn đúng đi bạn ơi!!!");
                        break;
                }
            } else {
                System.out.println("Có méo đâu mà xóa");
                flag = false;
            }
        }
    }
}
