package Day_07;

public class primeOrNot {
    public static boolean isPrime(int n){
        for(int i =2 ; i< n-1; i++){
            if(n==2){
              return true;
            }
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
