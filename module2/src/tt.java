

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author pradeep
 *
 */
public class tt {
    public static void main(String[] args) {

//        // Date in String format.
//        String dateString = "2015-03-01";
//
//        // Converting date to Java8 Local date
//        LocalDate startDate = LocalDate.parse(dateString);
//        LocalDate endtDate = LocalDate.now();
//        // Range = End date - Start date
//        Long range = ChronoUnit.DAYS.between(startDate, endtDate);
//        System.out.println("Number of days between the start date : " + dateString + " and end date : " + endtDate
//                + " is  ==> " + range);
//
//        range = ChronoUnit.DAYS.between(endtDate, startDate);
//        System.out.println("Number of days between the start date : " + endtDate + " and end date : " + dateString
//                + " is  ==> " + range);
        //-------------------------------------------------------
//        LocalDate localDate1 = LocalDate.parse("2020-02-01").withDayOfYear(15);
//        System.out.println("localDate1: " + localDate1); // 2020-01-15
//
//        LocalDate localDate2 = LocalDate.parse("2020-02-01").withDayOfYear(29);
//        System.out.println("localDate2: " + localDate2); // 2020-01-29
//
//        LocalDate localDate3 = LocalDate.parse("2020-02-01").withDayOfYear(35);
//        System.out.println("localDate3: " + localDate3); // 2020-02-04

        //-------------------------------------------------------------------------
//        String date = "2020-01-10";
//        LocalDate before = LocalDate.parse(date);
//        LocalDate localDate = LocalDate.now();
//        // LocalDate's plus methods (+)
//        System.out.println("Addition of days : " + localDate.plusDays(5)); // Addition of days : 2020-01-09
//        System.out.println("Addition of months : " + localDate.plusMonths(15)); // Addition of months : 2021-04-04
//        System.out.println("Addition of weeks : " + localDate.plusWeeks(45)); // Addition of weeks : 2020-11-14
//        System.out.println("Addition of years : " + localDate.plusYears(5)); // Addition of years : 2025-01-04x
//
//        // LocalDate's minus methods (-)
//        System.out.println("Subtraction of days : " + localDate.minusDays(6)); // Subtraction of days : 2019-12-30
//        System.out.println("Subtraction of months : " + localDate.minusMonths(15)); // Subtraction of months : 2018-10-04
//        System.out.println("Subtraction of weeks : " + localDate.minusWeeks(45)); // Subtraction of weeks : 2019-02-23
//        System.out.println("Subtraction of years : " + localDate.minusYears(5)); // Subtraction of years : 2015-01-04
        //------------------------------------------------------------
        // dd-LL-yyyy pattern (date -> string)
        LocalDate localDate = LocalDate.now();
//        DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("dd-LL-yyyy");
//        System.out.println(localDate.format(dateFormatter4)); // 04-01-2020

        //-------------------------------------------------------
        System.out.println("Year : " + localDate.getYear()); // Year : 2020
        System.out.println("Month : " + localDate.getMonth().getValue()); // Month : 1
        System.out.println("Day of Month : " + localDate.getDayOfMonth()); // Day of Month : 4
        System.out.println("Day of Week : " + localDate.getDayOfWeek()); // Day of Week : SATURDAY
        System.out.println("Day of Year : " + localDate.getDayOfYear());

        //------------- Có thể dùng thêm ifAter , Equal, compareTo
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now().plusDays(1);
        LocalDate d3 = LocalDate.now().minusDays(1);
        System.out.println(d1.isBefore(d2)); // true
        System.out.println(d1.isBefore(d3)); // false
        System.out.println(d1.isBefore(d1)); // false

        //----------------
        // Parses the first date
        LocalDate dt1 = LocalDate.parse("2018-11-27");
        // Parses the second date
        LocalDate dt2 = LocalDate.parse("2017-11-27");

        // Checks
        System.out.println(dt1.isAfter(dt2));
    //-----------------------chuyển localdate thành chuỗi
        DateTimeFormatter dateFormatter4 = DateTimeFormatter
                .ofPattern("dd-MM-yyyy");
        System.out.println(localDate.format(dateFormatter4)); // 04-01-2020


        //----------------------------------------------------------
//        teacherList = readWriterToFileTeacher.readToFileTeacher();
//
//        System.out.println("---SEARCH TEACHER---");
//        System.out.println("nhập id");
//        String id = scanner.nextLine();
//
//        boolean flag = false;
//        for (Teacher teacher: teacherList) {
//            if (teacher.getId().contains(id)) {
//                flag = true;
//                break;
//            }
//        }
//
//        if (flag) {
//            for (Teacher teacher : teacherList) {
//                if (teacher.getId().contains(id)) {
//                    System.out.println(teacher);
//                }
//            }
//        } else {
//            try {
//                throw new ThrowException(" không có id " + id + " ở trong danh sách");
//            } catch (ThrowException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//
// -----------------------------------------------------------------------------
//
// System.out.println("---DELETE TEACHER---");
//    teacherList = readWriterToFileTeacher.readToFileTeacher();
//    System.out.println("nhập id");
//    String id = scanner.nextLine();
//
//    for (int i = 0; i < teacherList.size(); i++) {
//        if (id.equals(teacherList.get(i).getId())) {
//
//            System.out.println("bạn có muốn xóa khỏi danh sách không\n" +
//                    "1: yes\n" +
//                    "2: no");
//            Integer luaChon = CheckTryCatch.getChoiceInteger();
//            switch (luaChon) {
//                case 1:
//                    teacherList.remove(i);
//                    System.out.println(" xóa thành công");
//                    readWriterToFileTeacher.writerToFileTeacher(teacherList);
//                    break;
//                case 2:
//                    System.out.println("bạn đã không xóa");
//                    break;
//                default:
//                    System.out.println(" bạn nhập sai! xin mời nhập lại");
//                    break;
//            }
//            return;
//        }
//    }
//    try {
//        throw new ThrowException("không có id " + id + " ở trong danh sách");
//    } catch (ThrowException e) {
//        e.printStackTrace();
//
//
//    }
//}
    }

}