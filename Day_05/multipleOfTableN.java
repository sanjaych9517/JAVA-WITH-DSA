package Day_05;
import java.util.*;
public class multipleOfTableN {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("plz inter a number : ");
        int num = sc.nextInt();
        for(int i = 1 ; i <= 10; i++ ){
               int table = num*i;
               System.out.println(table);
        }
    }
}
