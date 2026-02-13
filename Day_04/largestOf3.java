package Day_04;
import java.util.*;
public class largestOf3 {
    public static void main(String rgs []){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your First Number : ");
         int num1 = sc.nextInt();
         System.out.print("Please enter your second number: ");
         int num2 = sc.nextInt();
         System.out.print("Please enter your third number : ");
         int num3 = sc.nextInt();

         if(num1 > num2 && num1 > num3){
            System.out.println("num1 is largest : " + (num1));
         }
         else if( num2 > num3){
            System.out.println("num2 is grater " + (num2));
         }
         else{
            System.out.println(" num3 is grater : " + (num3));
         }
        
    }
}
