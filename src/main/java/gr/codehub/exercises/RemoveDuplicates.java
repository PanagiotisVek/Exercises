package gr.codehub.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    private List<Integer> listWithoutDuplicates = new ArrayList<Integer>();

    public List<Integer> ThrowDuplicates(List<Integer> TheList) {
        listWithoutDuplicates = TheList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.print("The List without Duplicates is: ");
        for (int i = 0; i < listWithoutDuplicates.size(); i++) {
            System.out.print(listWithoutDuplicates.get(i) + " ");
        }
        System.out.println("");

        return listWithoutDuplicates;
    }
}
