package weekFour;

public class TestAccount {
    public static void main(String[] args){
        Account A1 = new Account("d10", "George", 10000);
        Account Ainee = new Account ("007", "Ainee", 1000);
        Account George = new Account ("008", "George", 500);

        Ainee.TransferTO(George, 500);
        System.out.println("the account details are:" + A1);
        System.out.println("the account details are:" + Ainee);
        System.out.println("the account details are:" + George);
    }
    
}
