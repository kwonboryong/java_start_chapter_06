package chapter06;

public class BankAcountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withDraw(3000);
        System.out.println("balance(잔고) : " + account.getBalance());
    }
}
