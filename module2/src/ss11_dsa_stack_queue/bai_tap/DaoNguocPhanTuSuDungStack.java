package ss11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuSuDungStack {
    public static Stack pushElementIntoStack(Stack stack, String[] arrayString){
        System.out.println(Arrays.toString(arrayString));
        for (int i = 0; i < arrayString.length; i++) {
            stack.push(arrayString[i]);
        }
        return stack;
    }
    public static String[] popElementGetOutStack(Stack stack){
        String[] array = new String[stack.size()];
        String temp;
        int size = stack.size();
        for (int i = 0; i <size;i++) {
            temp = (String) stack.pop();
            array[i] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử bạn muốn: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= (int) (Math.random()*99+1);
        }
        System.out.print("Mảng: ");
        System.out.print(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("\n Stack: "+stack);
        int temp;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            temp = (int) stack.pop();
            array[i] = temp;
        }
        System.out.println("\n Sau khi pop stack: "+stack);
        System.out.print("Mảng sau khi đảo: ");
        System.out.print(Arrays.toString(array));
        //----------------------------------------------------------------
        String string;
        String[] arrayString;
        boolean flag;
        do{
            System.out.print("\n Nhập chuỗi bạn cần: ");
            string =scanner.nextLine();
            arrayString = string.trim().split(" ");
             flag = true;
            for (int i =0; i<arrayString.length;i++){
                if (arrayString[i].equals("")){
                    flag = false;
                    break;
                }
            }
        }while (!flag);
        Stack newStack=pushElementIntoStack(stack,arrayString);
        System.out.print("\n Chuỗi: " +string);
        System.out.print("\n Mảng đảo ngược là: ");
        System.out.println(Arrays.toString(popElementGetOutStack(newStack)));

    }
}
