package ss19_string_regex.thuc_hanh.validate_account;

public class ValidateAccount {
    private static final String REGEX_ACOUNT = "^[a-z0-9A-Z][A-Za-z0-9_]{5,}$";

    public ValidateAccount() {
    }

    public boolean isMatchesAccount(String string){
        return string.matches(REGEX_ACOUNT);
    }
}
