package Day_07;

public class binomialCofficient {
    public static int factorial(int n){
         int fact = 1;
         for(int i = 1 ; i<= n ; i++){
            fact = fact*i;
           
         }
          return fact;
    }
    public static int BC(int n, int r){
      int  fact_n = factorial(n);
       int  fact_r = factorial(r);
       int  factnr = factorial(n-r);

       int bincoff = ((fact_n)/ (fact_r*factnr));
       return bincoff;
        
    }
    public static void main(String[] args) {
        System.out.println(BC(5,5));
    }
}
