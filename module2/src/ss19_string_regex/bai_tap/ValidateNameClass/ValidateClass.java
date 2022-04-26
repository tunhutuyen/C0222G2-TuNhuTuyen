package ss19_string_regex.bai_tap.ValidateNameClass;

public class ValidateClass {
    private static final String REGEX_NAME_CLASS ="^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateClass() {
    }
    public boolean isMatchesNameClass(String string){
        return string.matches(REGEX_NAME_CLASS);
    }
}
