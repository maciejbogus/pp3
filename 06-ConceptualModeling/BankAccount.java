public class BankAccount {
    private double balance=0;
    private String accId;
    private String currency;
    private String name;
    private String surname;

    public BankAccount(String name_, String surname_, String accId_, String currency_){
        this.name = name_;
        this.surname = surname_;
        this.accId = accId_;
        this.currency = currency_;
    }

    public void withdraw (double amount){
        if(amount <= 500){
            if((balance - amount)>=0){
                this.balance -= amount;
                System.out.println(amount+this.currency+" withdrawed");
            }
            else System.out.println("You don't have enough money!");
        }
        else{
            System.out.println("You can't withdraw more than 500"+this.currency);
        }
        
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount+this.currency+" deposited");
    }

    public String getBalance(){
        return "Your balance: "+this.balance+" "+this.currency+"\n";
    }

    public static void main(String[] str){
        BankAccount a1 = new BankAccount("Maciej", "Bogus", "696969", "$");
        a1.deposit(500);
        System.out.println(a1.getBalance());
        a1.deposit(200);
        System.out.println(a1.getBalance());
        a1.withdraw(501);
        System.out.println(a1.getBalance());
    }
}