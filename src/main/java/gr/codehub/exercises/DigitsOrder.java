package gr.codehub.exercises;

import java.util.Arrays;

public class DigitsOrder {

    DigitCount dg = new DigitCount();

    public void DigitsOrderFun(int number) {

        int number_size = dg.Counter(number);
        int[] thearray = new int[number_size];
        int j = 0;
        for (int i = 0; i <= number_size; i++) {
            if (i < number_size)
                thearray[j] = (number / (10 * (number_size - i)) % 10);
            j++;
        }
        thearray[number_size-1] = number % 10;
        Arrays.sort(thearray);

        System.out.print("Correct Digits Order: ");
        for (int i = 0; i < thearray.length; i++) {
            System.out.print(thearray[i]);
        }
        System.out.println("");
    }
}
