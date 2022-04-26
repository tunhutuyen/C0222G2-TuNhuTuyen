package ss19_string_regex.thuc_hanh.validate_mail;

public class CheckMail {
    private static ValidateMail emailExample = new ValidateMail();
    private static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    private static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        for (String email: validEmail) {
            boolean flagValidate = emailExample.isMatchesMail(email);
            System.out.println("Email is " + email +" is valid: "+ flagValidate);
        }
        for (String email: invalidEmail){
            boolean flagValidate = emailExample.isMatchesMail(email);
            System.out.println("Email is " + email +" is valid: "+ flagValidate);
        }
    }
}
