package Day_08;

public class hollowRhombousPattern {
    public static void  hollowRhombousPattern(int n){
         for(int i = 0 ; i <= n ; i ++){
            for(int j = 0; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 0; j <=n; j ++){
                if(i==0 || i ==n || j==0 || j==n){
                    System.out.print("*");
                }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombousPattern(18);
    }
}
