package Day_03;
import java.util.*;
public class avgOf3Numbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("enter Second number :");
        int num2 = sc.nextInt();

        System.out.print("enter Third number : ");
        int num3 = sc.nextInt();

        int avg = (num1 + num2 +num3)/3;
        System.out.println("Avg of three number = "  + avg);
     }
}
