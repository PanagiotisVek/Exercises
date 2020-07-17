package gr.codehub.exercises;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Ex5
        DigitCount Dc = new DigitCount();
        Dc.Counter(328888888);

        //Ex6
        DecimalPart Dp = new DecimalPart();
        Dp.countDecimalPart(43.233f);

        //Ex1
        PrimeSubList Psl = new PrimeSubList();
        int[] ids = {5, 7, 13, 18, 25, 54, 54};
        ArrayList<Integer> values = new ArrayList<>();
        for (int id: ids) {
            values.add(id);
        }

        Psl.CreatePrimeSubList(values);

        //Ex2
        RemoveDuplicates Rd = new RemoveDuplicates();
        Rd.ThrowDuplicates(values);

        //Ex3
        DigitsOrder Do = new DigitsOrder();
        Do.DigitsOrderFun(54358);

        //Ex4+Ex5
        StringBuffer s= new StringBuffer("GeeksQuiz");
        Stack TheStack = new Stack(s.length());
        TheStack.reverse(s);

        //Ex7
        StringBuffer s1= new StringBuffer("ABBA");
        SymmetricCheck Sc = new SymmetricCheck();
        Sc.CheckSymmetricFun(s1);

        return ;
    }
}
