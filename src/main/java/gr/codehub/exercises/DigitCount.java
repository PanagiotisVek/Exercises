package gr.codehub.exercises;

import lombok.Setter;


public class DigitCount {

    private int count;
    //private long number;

public int Counter(long number){
        while(number != 0)
    {
        // num = num/10
        number /= 10;
        ++count;
    }

        System.out.println("Number of digits: " + count);
        return count;
}
}
