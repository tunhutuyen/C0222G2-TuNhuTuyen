package ss19_string_regex.thuc_hanh.validate_mail;

public class ValidateMail {
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";

    public ValidateMail() {
    }

    public boolean isMatchesMail(String string){
        return string.matches(REGEX_EMAIL);
    }
}
