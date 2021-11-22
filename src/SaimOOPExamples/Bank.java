package SaimOOPExamples;

public class Bank {
    private double balance;
    public void withdraw(double money){
        if(money>balance) throw  new NotEnoughMoneyException();
        else if(balance<=0) throw new NotEnoughMoneyException();
        System.out.println("Withdrawing $" + money);
        balance-=money;
    }



    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }
}
