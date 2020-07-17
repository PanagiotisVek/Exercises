package gr.codehub.exercises;

public class Stack {
    int size;
    int top;
    char[] word;

    //function to check if stack is empty
    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int s) {
        top = -1;
        size = s;
        word = new char[size];
    }

    boolean push(char y) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            word[++top] = y;
            return true;
        }
    }

    //function to pop element from stack
    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            char x = word[top--];
            return x;
        }
    }

    char peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return word[top];
        }
    }

    public StringBuffer reverse(StringBuffer word) {

        int size = word.length();
        Stack obj = new Stack(size);

        int i;
        for (i = 0; i < size; i++)
            obj.push(word.charAt(i));

        for (i = 0; i < size; i++) {
            char ch = obj.pop();
            word.setCharAt(i, ch);
        }

        System.out.println("Reversed string is " + word);
        return word;
    }
}

