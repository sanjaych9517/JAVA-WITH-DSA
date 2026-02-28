import java.util.*;
public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first Name : ");
        String str1 = sc.next();
         System.out.print("Enter your Second Last name : ");
        String str2 = sc.next();

         String fullName = str1 + " " + str2;

        System.out.println(fullName);
    }
}
