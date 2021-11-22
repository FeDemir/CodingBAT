package SaimOOPExamples;

public class UseBank {
    public static void main(String[] args) {
        Bank bank= new Bank(100);
        bank.setBalance(500);
        System.out.println("bank.getBalance(1) = " + bank.getBalance());
        
        bank.withdraw(250);
        System.out.println("bank.getBalance(2) = " + bank.getBalance());

        //bank.withdraw(1000);
        bank.setBalance(-500);
        System.out.println("bank.getBalance(3) = " + bank.getBalance());
        
        bank.withdraw(0);
        System.out.println("bank.getBalance(4) = " + bank.getBalance());

    }
}
