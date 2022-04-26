package ss19_string_regex.bai_tap.ValidatePhoneNumber;

public class ValidatePhoneNumber {
    private static final String REGEX_NUMBER = "^(\\([0-9]{2}\\))[-]\\([0][0-9]{9}\\)$";

    public ValidatePhoneNumber() {
    }
    public boolean isMatchesPhoneNumber (String string){
        return string.matches(REGEX_NUMBER);
    }
}
