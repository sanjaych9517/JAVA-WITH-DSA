package Day_15_OOPS;

public class ClassObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColour("red");
        System.out.println(p1.colour);
        p1.setTip(6);
        System.out.println(p1.tip);
    }
}

class Pen{
    String colour;
    int tip;

     void setColour(String newColour){
         colour = newColour;
     }

     void setTip(int newTip){
        tip = newTip;
     }
}

 class  Student {
        String name;
        int mark;
        int age;

        void percentage(int phy, int chem, int math){
           int  totalPercent = ( phy+ chem+math)/3;
        }
    
}
