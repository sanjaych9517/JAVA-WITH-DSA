import java.util.*;
public class CharAt {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Plz inter Your String : ");
         String str = sc.nextLine();
         PrintLetter(str);
    }
    public static void PrintLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
