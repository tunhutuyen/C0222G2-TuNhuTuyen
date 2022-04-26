package ss19_string_regex.thuc_hanh.validate_account;

public class CheckAccount {
    private static ValidateAccount accountExample= new ValidateAccount();

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        for (String email: validAccount) {
            boolean flagValidate = accountExample.isMatchesAccount(email);
            System.out.println("Email is " + email +" is valid: "+ flagValidate);
        }
        for (String email: invalidAccount){
            boolean flagValidate = accountExample.isMatchesAccount(email);
            System.out.println("Email is " + email +" is valid: "+ flagValidate);
        }
    }
}
