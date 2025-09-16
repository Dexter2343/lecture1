package lessonOne;

public class Bank {
    private String owner;
    private double balance;

    public Bank(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount >= balance){
            this.balance -= amount;
            System.out.println("you have enough money for withdrawal");
        } else {
            System.out.println("you have not enough money for withdrawal");
        }

    }

    public double getBalance() {
        return balance;
    }
}
