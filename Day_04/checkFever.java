package Day_04;
import java.util.*;
public class checkFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter first number : ");
        float temp = sc.nextFloat();

        if(temp >= 98.6){
            System.out.println("  Fever");
        }
        else{
            System.out.println("Not fever");
        }
    }
}
