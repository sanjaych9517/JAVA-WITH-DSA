package Day_04;
import java.util.*;

public class largestOf2Number {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          
         System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
         System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("num1 is grater = " + num1);
        }

        else{
             System.out.println("num2 is grater = " + num2);
        }
    }
   
}
