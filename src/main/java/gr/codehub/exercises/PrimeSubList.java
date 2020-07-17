package gr.codehub.exercises;

import java.util.ArrayList;
import java.util.List;

public class PrimeSubList {
    private ArrayList<Integer> PrimeList = new ArrayList<Integer>();

    public boolean isPrime(int a) {
        boolean flag = false;
        for (int i = 2; i <= a / 2; ++i) {
            // condition for nonprime number
            if (a % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }

    public ArrayList<Integer> CreatePrimeSubList(ArrayList<Integer> TheList) {
        for (int temp : TheList) {
            if (isPrime(temp))
                PrimeList.add(temp);
        }

        System.out.print("The Prime List is: ");
        for(int i=0;i<PrimeList.size() ;i++){
            System.out.print(PrimeList.get(i) + " ");
        }
        System.out.println("");
        return PrimeList;
    }

}
