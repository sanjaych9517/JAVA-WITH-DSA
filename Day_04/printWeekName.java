package Day_04;
import java.util.*;
public class printWeekName {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num1 = sc.nextInt();

        switch (num1) {
            case 1 :
                System.out.println("Monday");
                break;

                case 2 :
                System.out.println("Tueday");
                break;

                case 3 :
                System.out.println("Wednesday");
                break;

                case 4 :
                System.out.println("Thrusday");
                break;

                case 5 :
                System.out.println("Friday");
                break;

                case 6 :
                System.out.println("Saturday");
                break;

                case 7 :
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("plz inter the number between 1 to 7");
                break;
        }
    }
    
}
