package quan_ly_khach_san_furama.common;

import quan_ly_khach_san_furama.models.facility.House;
import quan_ly_khach_san_furama.models.facility.Room;
import quan_ly_khach_san_furama.models.facility.Villa;
import quan_ly_khach_san_furama.models.person.Customer;
import quan_ly_khach_san_furama.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String PATH_EMPLOYEE = "src/quan_ly_khach_san_furama/data/employee.csv";
    private static final String PATH_CUSTOMER = "src/quan_ly_khach_san_furama/data/customer.csv";
    private static final String PATH_ROOM = "src/quan_ly_khach_san_furama/data/room.csv";
    private static final String PATH_HOUSE = "src/quan_ly_khach_san_furama/data/house.csv";
    private static final String PATH_VILLA = "src/quan_ly_khach_san_furama/data/villa.csv";

    //write file -------------------------------------------------------------------------------------
    private static void writeDataToCsv(List<String> stringList, String pathFile, boolean flag) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCustomerToCsv(List<Customer> customerList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInfo());
        }
        writeDataToCsv(stringList, PATH_CUSTOMER, flag);
    }

    public static void writeEmployeeToCsv(List<Employee> employeeList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfo());
        }
        writeDataToCsv(stringList, PATH_EMPLOYEE, flag);
    }

    public static void writeVillaToCsv(List<Villa> villaList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa : villaList) {
            stringList.add(villa.getInfo());
        }
        writeDataToCsv(stringList, PATH_VILLA, flag);
    }

    public static void writeHouseToCsv(List<House> houseList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (House house : houseList) {
            stringList.add(house.getInfo());
        }
        writeDataToCsv(stringList, PATH_HOUSE, flag);
    }

    public static void writeRoomToCsv(List<Room> roomList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Room room : roomList) {
            stringList.add(room.getInfo());
        }
        writeDataToCsv(stringList, PATH_ROOM, flag);
    }

    //read file------------------------------------------------------------
    private static List<String> readFileCsvToList(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Villa> readFileCsvToListVilla() {
        List<String> stringList = readFileCsvToList(PATH_VILLA);
        List<Villa> villaList = new ArrayList<>();
        Villa villa = null;
        for (String string : stringList) {
            String[] array = string.split(";");
            villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6], Double.parseDouble(array[7]), Integer.parseInt(array[8]));
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<House> readFileCsvToListHouse() {
        List<String> stringList = readFileCsvToList(PATH_HOUSE);
        List<House> houseList = new ArrayList<>();
       // String[] array = null;
        House house = null;
        for (String string : stringList) {
            String[] array = string.split(";");
            house = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7]));
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Room> readFileCsvToListRoom() {
        List<String> stringList = readFileCsvToList(PATH_ROOM);
        List<Room> roomList = new ArrayList<>();
        //String[] array = null;
        Room room = null;
        for (String string : stringList) {
            String[] array = string.split(";");
            room = new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5], array[6]);
            roomList.add(room);
        }
        return roomList;
    }

    public static List<Employee> readFileCsvToListEmployee() {
        List<String> stringList = readFileCsvToList(PATH_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();
        //String[] array = null;
        Employee employee = null;

            for (String string : stringList) {
                String[] array = string.split(";");
                employee = new Employee(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6],array[7], array[8],Long.parseLong(array[9]));
                employeeList.add(employee);
            }
            return employeeList;

//        for (String string : stringList) {
//            String[] array = string.split(";");
//            employee = new Employee(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6],array[7], array[8],Long.parseLong(array[9]));
//            employeeList.add(employee);
//        }

    }
    public static List<Customer> readFileCsvToListCustomer() {
        List<String> stringList = readFileCsvToList(PATH_CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        //String[] array = null;
        Customer customer = null;
        for (String string : stringList) {
            String[] array = string.split(";");
            customer = new Customer(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6],array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

}
