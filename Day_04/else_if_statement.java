package Day_04;
import java.util.*;
public class else_if_statement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("plz enter your age : ");
        int age = sc.nextInt();

        if(age >= 18 ){
            System.out.println("You are also eligible for give vote and draving a car");
        } 
        else if( age > 13 && age <=17){
               System.out.println("you are tinger.");

               }
               else{
                 System.out.println("you are child");
               }
        }
    }

