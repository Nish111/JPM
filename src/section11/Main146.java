package section11;

public class Main146 {
        public static void main(String[] args) {
            String varFour = "this is private to main()";

            /*ScopeCheck scopeInstance = new ScopeCheck();
            //scopeInstance.useInner();

            //ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
            // System.out.println("varThree is not accessible here " + innerClass.varThree);
//
            System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
            System.out.println(varFour);

            System.out.println("scopeInstance varOne is " + scopeInstance.getPrivateVar());
            System.out.println(varFour);

            scopeInstance.timesTwo();
            System.out.println("***********************************");
            ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
            innerClass.timesTwo();*/

            RefactoredScopeCheck rScopeInstance = new RefactoredScopeCheck();
            rScopeInstance.useInner();

            RefactoredScopeCheck.InnerClass innerClass = rScopeInstance.new InnerClass();
            // 'varThree' has private access in 'section11.RefactoredScopeCheck.InnerClass'
            // so below not possible
            //System.out.println("varThree is not accessible here " + innerClass.varThree);
//
            System.out.println("scopeInstance varOne is " + rScopeInstance.getVarOne());
            System.out.println(varFour);

            rScopeInstance.timesTwo();
            System.out.println("***********************************");
            RefactoredScopeCheck.InnerClass innerClass1 = rScopeInstance.new InnerClass();
            innerClass1.timesTwo();
        }

}
