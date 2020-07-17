package gr.codehub.exercises;

public class SymmetricCheck {
    public boolean CheckSymmetricFun(StringBuffer word) {

        Stack TheStack = new Stack(word.length());
        if (TheStack.reverse(word) == word) {
            System.out.println("It's Symmetric!");
            return true;
        } else {
            System.out.println("It's not Symmetric!");
            return false;
        }
    }
}
