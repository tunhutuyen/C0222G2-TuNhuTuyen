package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinerEquaTionResolver {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolver");
        System.out.println("Equation: 'a * x + b = c', please enter const:");

        Scanner input = new Scanner(System.in);

        System.out.println("a: ");
        double a = input.nextDouble();

        System.out.println("b: ");
        double b = input.nextDouble();

        System.out.println("c: ");
        double c = input.nextDouble();

        if (a != 0){
            double result = (c -b) / a;
            System.out.println("Equation pass with x =\n"+ result);
        }else if (b == c){
            System.out.println("Vô số nghiệm");
        }else {
            System.out.println("Vô nghiệm");
        }
    }
}
