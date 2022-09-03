package section11.Final_StaticInitializers152;

/**
 * Created by dev on 23/11/2015.
 */
public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

/*    @Override
    public void storePassword() { // cannot override as it is final
        System.out.println("Saving password as "
                + this.decryptedPassword);
    }*/
}
