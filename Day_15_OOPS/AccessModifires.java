package Day_15_OOPS;

public class AccessModifires {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Sanjay Kapoor";
        myAcc.setPassword("Sanjay");
    }
}
class BankAccount{
    public String name;
    private String passwors;
    public void setPassword(String pwd){
        passwors = pwd;
    }
}
