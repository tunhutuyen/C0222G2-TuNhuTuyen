package ss4_LopVaDoiTuongTrongJava.bai_tap;

import java.util.Arrays;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] array = new int[10000];
        StopWatch stopWatch = new StopWatch();
        for (int i=0; i<array.length;i++){
            array[i]= (int)(Math.random()*500);
        }
        stopWatch.start();
        System.out.print("\n Before array: \n--------------------------------------"+Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }
        }
         stopWatch.end();
        System.out.print("\n sort array ------------------------------------------------------------:"+Arrays.toString(array));
        System.out.print("\n Before: "+stopWatch.getStartTime());
        System.out.print("\n After: "+stopWatch.getEndTime());
        System.out.print("\n Time: "+stopWatch.getElapsedTime());
    }
}
