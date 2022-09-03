package section6;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String email;
    public String getCustomerName() {
        return customerName;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    public VipCustomer(){
        this("Default name", 500.0, "abc@abc.com");
        System.out.println("Empty constructor");
    }
    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "abc@abc.com");
    }
    public VipCustomer(String customerName, double creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email =email;
    }
}
