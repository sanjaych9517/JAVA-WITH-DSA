package Day_07;

public class functionOverloadingUsingParameter {
    public static int sum(int a, int b){
        int s = a+b;
        return s;
    }

    public static int sum(int a, int b, int c){
        int s = a+b+c;
        return s;
    }
    public static void main(String[] args) {
       int a= sum(2,3,4);
         int b = sum(2,3);

        System.out.println(a);
        System.out.println(b);

    }
}
