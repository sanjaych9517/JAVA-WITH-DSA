public class StringEquals {
    
    public static void main(String[] args) {
        String s1 = "Tony";
        String  s2 = "Tony";
        String s3 = new String("Tony");
     
        // check for s1 & s2
        if(s1 == s2){
            System.out.println("s1 is equal to s2");
        }
        else{
            System.out.println("S1 is not equal to s2");
        }

         // check for s1 & s3
        if(s1 == s3){
            System.out.println("s1 is equal to s3");
        }
        else{
            System.out.println("S1 is not equal to s3");
        }

        // .equals function used
         // check for s1 & s3
        if(s1.equals(s3)){
            System.out.println("s1 is equal to s3");
        }
        else{
            System.out.println("S1 is not equal to s3");
        }


;    }
}
