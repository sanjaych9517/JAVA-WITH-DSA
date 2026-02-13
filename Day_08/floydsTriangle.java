package Day_08;

public class floydsTriangle {
    public static void floyds(int n){
        int count =0;
        for (int i = 1; i <=n; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds(6);
    }
}
