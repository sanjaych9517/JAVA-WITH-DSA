package Day_12_2DArrays;
public class question_02 {
    // print out the sum of the ny=umber in the second row of the nums array
    //input int [][] nums = {{1,4,9}, {11,4,3},{2,2,3}};
    public static void main(String[] args) {
        int [][] nums = {{1,4,9},
                         {11,4,3},
                         {2,2,3}
        };
        int sum = 0; 
         int j = 0;

        while( j <nums[1].length){
          sum += nums[1][j];
          j++;
        }
        System.out.println(sum);
    }
}
