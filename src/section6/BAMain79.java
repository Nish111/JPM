package section6;

public class BAMain79 {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();//"12345", 0.00,
               // "Loid", "abc@g.com","123");

        /*bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Builder");
        bobsAccount.setEmail("bob@bob.com");
        bobsAccount.setPhoneNumber("(07234)223454");*/
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(50);
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(51);

        bobsAccount.withdrawFunds(100);

        BankAccount anyasAccount = new BankAccount("Anya",
                "anya@abc.com", "123");
        System.out.println(anyasAccount.getAccountNumber() +
                " name " + anyasAccount.getCustomerName());
        System.out.println("-------Vip Customer starts --------");
        VipCustomer yor = new VipCustomer();
        System.out.println(yor.getCustomerName());
        VipCustomer bond = new VipCustomer("Bond", 2400.6);
        System.out.println(bond.getCustomerName());
        VipCustomer loid = new VipCustomer("Loid", 3500, "loid@abc.com");
        System.out.println(loid.getCustomerName());
        System.out.println(loid.getEmail());
    }
}
