public class DemoStringStringBuidlerStringBuffer {
    public static void main(String[] args) {
        String s1 = "abc";
        String s3 = "abc";
        s1 += "zyx";
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("qwe");
        s2.append("QWE");
        System.out.println(s2);
    }
}
