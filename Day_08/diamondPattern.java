package Day_08;

public class diamondPattern {
    public static void diamondPattern(int n){
         for(int i=0; i<=n; i++){
            for(int j =0; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=(i); j++ ){
                    System.out.print("*");
                   
            }
            for(int j =0; j<(i); j++){
                System.out.print("*");
            }
            System.out.println();
         }
    
    // for bottom part
    for(int i=n; i>=0; i--){
            for(int j =0; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=(i); j++ ){
                    System.out.print("*");
                   
            }
            for(int j =0; j<(i); j++){
                System.out.print("*");
            }
            System.out.println();
         }
        }
    public static void main(String[] args) {
        diamondPattern(8);
    }
}
