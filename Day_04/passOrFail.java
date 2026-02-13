package Day_04;
import java.util.*;
public class passOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = sc.nextInt();
         System.out.print("Enter your number of subject : ");
        int tSubject = sc.nextInt();

        int result = (int)((mark/tSubject));
        if(result >=33){
            System.out.println("Student pass : " + (result));
        }
        else{
            System.out.println("Student fail : " + (result));
        }
    }
}
