package Day_04;
import java.util.*;

public class if_elseStatement {
    public static void main(String args[]){
        int age = 11;
        if(age >= 18){
            System.out.println("You are Eligible for for vote and Draving");
        }
        if(age >= 13 && age < 18 ){
             System.out.println("You are twined");
        }
        else{
            System.out.println("You are children");
        }
    }
}
