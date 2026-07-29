package Day_16_recursionBasic_part_01;
public class reducePowXN {

    public static int reducePowXN(int a, int n){
     if(n == 0){
        return 1;
     }
      int halfPower = reducePowXN(a, n/2);
      int halfPowerSq = halfPower * halfPower;

      // n is odd

      if(n%2 != 0){
        halfPowerSq = a * halfPowerSq;
      }
      return halfPowerSq;

    }
     public static void main(String[] args) {
        System.out.println(reducePowXN(2, 4));
     }
}
