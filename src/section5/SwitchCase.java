package section5;

public class SwitchCase {
    public static void main(String[] args) {
        int switchValue = 3;
        // byte short int char can be used
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was C or D or E");
                System.out.println("Actually it was a " + charValue);
                break;
            default:
                System.out.println("Value was not A or B or C or D or E");
                break;
        }
        String month = "June";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
           default:
                System.out.println("Not sure");
                break;
        }
    }
}
