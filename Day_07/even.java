package Day_07;

public class even {
    public static boolean even(int  n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       System.out.println( even(7));
    }
}
