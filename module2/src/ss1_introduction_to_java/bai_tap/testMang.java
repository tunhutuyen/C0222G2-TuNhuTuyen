package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class testMang {
    public static void main(double score) {
//        String s1 = "hello";
//        char[] ch = s1.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            System.out.println(ch[i]);
//        }

//        int i = 1;
//        while(i < 5){
//            if(i % 3 != 0){
//                i++;
//                continue;
//            }
//            System.out.println("Hello");
//            i++;
//        }
//---------------------------------------------------------------
//        int[] sourceArray = {2, 3, 1, 5, 10};
//        int[] targetArray = new int[sourceArray.length];
//        for (int i=0; i < sourceArray.length; i++) {
//            targetArray[i] = sourceArray[i];
//            System.out.print(targetArray[i]+" ");
//        }
//
//        System.arraycopy(sourceArray, 2, targetArray, 1, sourceArray.length-2);
//        //System.out.println(targetArray);
 //       for (int i = 0; i < targetArray.length; i++) {
 //           System.out.print(targetArray[i] + " ");
//        }
            //---------------------------------------------------------------------
      int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = a;

        System.out.println(a.length/2);
        System.out.println(a==b);//false
        System.out.println(a==c);//true
 //       }
// -----------------------------------------------------
//        if (score < 0 || score > 100) {
//            System.out.println("Invalid score");
//            return;
//        }
//        if (score >= 90.0) {
//            System.out.println('A');
//        }else if (score >= 80.0) {
//            System.out.println('B'); }
//        else if (score >= 70.0) {
//            System.out.println('C');
//        }else if (score >= 60.0) {
//            System.out.println('D'); }
//        else { System.out.println('F');
//        }
    }
}
