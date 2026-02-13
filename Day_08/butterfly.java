package Day_08;

public class butterfly {
    public static void butterfly(int n){
        for (int i = 0; i <=n; i++) {
            // for first half uppar part
            for(int j = 0; j<= i; j++){
                System.out.print("@ ");
            }
            // for space of upper part
            for( int j = 0; j<(n-i); j++){

                 System.out.print("  ");
                 System.out.print("  ");
            }
            // for last half
            for(int j = 0; j<=i; j++){
                System.out.print("@ ");
            }
           System.out.println();
        }
        // for bottom half 
         for (int i = n; i >=0; i--) {
            // for first half uppar part
            for(int j = 0; j<= i; j++){
                System.out.print("@ ");
            }
            // for space of upper part
            for( int j = 0; j<(n-i); j++){

                 System.out.print("  ");
                 System.out.print("  ");
            }
            // for last half
            for(int j = 0; j<=i; j++){
                System.out.print("@ ");
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(15);
    }
}
