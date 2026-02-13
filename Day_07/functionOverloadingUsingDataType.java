package Day_07;

public class functionOverloadingUsingDataType {
     public static float sum(float a, float b){
        float s = a+b;
        return s;
    }

    public static int sum(int a, int b){
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
       float  a= sum(2.8f,3.9f);
         int b = sum(2,3);

        System.out.println(a);
        System.out.println(b);

    }
}
