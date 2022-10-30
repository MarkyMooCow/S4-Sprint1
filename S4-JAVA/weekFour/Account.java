package weekFour;

public class Account{
    
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int Credit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
    public int Debit(int amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
            return this.balance;
        }
       else {
        System.out.println("amount exceeds balance");
        return this.balance;
       }
        
    }
    public int TransferTO(Account another, int amount){
        // this.balance --> another.balance
        if(this.balance>=amount){
            this.balance = this.balance - amount;
            another.balance = another.balance + amount;
            }
            else
            System.out.println("Amount exceeded balance");
            return this.balance;
       
    }
    @Override
    public String toString() {
        return "Account id=" + id + ", name=" + name + ", balance=" + balance;
    }
        
    


}







