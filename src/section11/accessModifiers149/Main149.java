package section11.accessModifiers149;

public class Main149 {
    public static void main(String[] args) {
        Account loidsAccount = new Account("Loid");
        loidsAccount.deposit(1000);
        loidsAccount.withdraw(500);
        loidsAccount.withdraw(-200);
        loidsAccount.deposit(-20);
        loidsAccount.calculateBalance();
        //loidsAccount.balance = 5000;

        System.out.println("Balance on account is " + loidsAccount.getBalance());
        //loidsAccount.transactions.add(4500);
        loidsAccount.calculateBalance();

        PrivateClass pc = new PrivateClass();
        pc.methodA();
        pc.methodB();
        pc.methodC();
    }
}
