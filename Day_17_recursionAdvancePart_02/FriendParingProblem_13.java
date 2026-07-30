package Day_17_recursionAdvancePart_02;

public class FriendParingProblem_13 {
    public static int fPProblem(int n) {
        if (n == 1 || n == 2) {
        return n;
        }
        // choce
        // single
        int fnm1 = fPProblem(n - 1);

        // Pair
        int fnm2 = fPProblem(n -2);
        int pairWayas = (n-1) *fnm2;
        //Total ways
        int totWays = fnm1 + pairWayas;
        return totWays;
        //    // shortwat way 2nd way
        
        // // return fPProblem(n-1) + (n-1)*fPProblem(n -2);
         
        //  // shortwat way 3nd way
        // return (n == 1 || n == 2) ? n :fPProblem(n-1) + (n-1)*fPProblem(n -2);
        
    } 
    
    public static void main(String[] args) {
        System.out.println(fPProblem(3));
    }
}
