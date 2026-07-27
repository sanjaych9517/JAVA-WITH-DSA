package Day_16_recursionBasic_part_01;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n = n * fact(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is " + fact(num));
        }
    }
}
