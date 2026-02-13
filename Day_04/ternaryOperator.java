package Day_04;
import java.util.*;
public class ternaryOperator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a numbyer");
    System.out.println();
    int num = sc.nextInt();
    String type = (num % 2 == 0)?"Even" : "odd";
    System.out.println(type);
     }
}
