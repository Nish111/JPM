package section8.part116;

public class Customer {
    private String name;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}
