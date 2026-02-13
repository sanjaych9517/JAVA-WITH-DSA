package Day_04;
import java.util.*;

public class oddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
          int number = sc.nextInt();

        if((number % 2) ==0){
            System.out.println("This is a even number : " + number);
        }

        else{
            System.out.print("This is odd number :" + number);
        }
    }
}
