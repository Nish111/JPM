package section11;

/**
 * Created by dev on 11/11/2015.
 */
public class RefactoredScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public RefactoredScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar +
                ": privateVar = " + varOne);
    }
    public int getVarOne() {       return varOne;    }
    public void timesTwo() {
        int varTwo = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }//System.out.println("Value of i is : " + i); // cannot resolve
    }
    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }
    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne +
                    " and varThree is " + varThree);
        }
        public void timesTwo() {
            //int privateVar = 2;
            System.out.println("varOne is still available here " + varOne);
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}

