package section9;

public class Gearbox {
    private boolean clutchIn;

    public void operate(boolean inOrOut){ // String inOrOut
        //this.clutchIn = inOrOut.equalsIgnoreCase("in");
        this.clutchIn = inOrOut;
    }
}
