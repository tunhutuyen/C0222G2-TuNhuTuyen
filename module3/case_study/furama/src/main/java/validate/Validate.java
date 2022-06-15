package validate;

import model.Division;
import model.EducationDegree;
import model.Position;
import service.IEmployeeService;
import service.impl.EmployeeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Validate {
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static final String REGEX_ID_CUSTOMER = "^KH\\-[0-9]{4}$";
    private static final String REGEX_ID_SERVICE = "^DV\\-[0-9]{4}$";
    private static final String REGEX_NUMBER_PHONE = "^(09|(\\(84\\)\\+9))[0-1][0-9]{7}$";
    private static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String REGEX_CARD = "^([0-9]{9})|([0-9]{12})$";
    private static final String REGEX_SALARY = "^[0-9]+$";
    private static final String REGEX_SPACE = "^\\s+$";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final String REGEX_NAME = "^(?![\\s.]+$)[a-zA-Z\\s.]*$";

    public static boolean checkDate(String date){
        Date dateParse ;
        try {
            dateParse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static boolean regexSpace(String str){
        return str.matches(REGEX_NAME);
    }

    public static boolean regexEmail(String email){
        return email.matches(REGEX_EMAIL);
    }
    public static boolean regexSalary(String salary){
        return salary.matches(REGEX_SALARY);
    }
    public static boolean regexNumberPhone(String phone){
        return phone.matches(REGEX_NUMBER_PHONE);
    }
    public static boolean regexCard(String card){
        return card.matches(REGEX_CARD);
    }
    public static boolean checkDivision(Integer idDivision){
        List<Division> divisions = iEmployeeService.showDivision();
        for (Division division:divisions) {
            if (division.getIdDivision().equals(idDivision)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkPosition(Integer idPosition){
        List<Position> positions = iEmployeeService.showPosition();
        for (Position item:positions) {
            if (item.getIdPosition().equals(idPosition)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkDegree(Integer idDegree){
        List<EducationDegree> educationDegrees = iEmployeeService.showEducationDegree();
        for (EducationDegree item:educationDegrees) {
            if (item.getIdDegree().equals(idDegree)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkSalary(Double salary){

        return true;
    }


}
