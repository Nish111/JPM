package section6;
// Constructors79
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        //System.out.println();
        this("5678", 2.50, "Default name",
                "Default address", "default phone");
        System.out.println("Empty constructor created");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double balance,
                       String  customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        //setAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        //System.out.println("Funds are deposited " + depositAmount);
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + balance);
    }
    public void withdrawFunds(double withdrawalAmount){
        if(this.balance < withdrawalAmount){
            //System.out.println("Insufficient funds, cannot withdraw " + withdrawalAmount);
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -=withdrawalAmount;
            //System.out.println("Funds are withdrawn " + amount);
            System.out.println("Withdrawal of " +withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }
}
