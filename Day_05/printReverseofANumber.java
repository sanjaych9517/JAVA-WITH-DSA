package Day_05;
import java.util.*;
public class printReverseofANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plz inter the number : ");
        int num = sc.nextInt();
        int ldigit;
        while(num > 0){
            ldigit = num % 10;
            System.out.print(ldigit);
            num =num/10;
        }
        System.out.println();
        
    }
}
