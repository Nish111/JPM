package section11.accessModifiers149;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface? // package private
// 2. the int variable SOME_CONSTANT? // everywhere
// 3. methodA? // everywhere
// 4. methodB and methodC? // everywhere as all interface methods are automatically public
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
