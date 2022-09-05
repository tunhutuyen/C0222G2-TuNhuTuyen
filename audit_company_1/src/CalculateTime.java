public class CalculateTime {
    public void calculateTime(String str1, String str2){
//       char[] arr1 = new char[str1.length()];
//        for (int i = 0; i < str1.length(); i++) {
//            arr1[i] = str1.charAt(i);
//            System.out.println(arr1);
//        }
        String[] st1= str1.split(":");
        int[] arr1 = new int[st1.length];
        for (int i = 0; i < st1.length; i++) {
            arr1[i] = Integer.parseInt(st1[i]);
        }
        System.out.println(arr1[0]);

        String[] st2= str2.split(":");
        int[] a = new int[st2.length];
        for (int i = 0; i < st2.length; i++) {
            a[i] = Integer.parseInt(st2[i]);
        }


    }

    public static void main(String[] args) {
        CalculateTime calculate = new CalculateTime();
        calculate.calculateTime("09:30:45","12:12:12");
    }

}
