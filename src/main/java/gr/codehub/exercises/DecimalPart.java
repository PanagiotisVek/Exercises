package gr.codehub.exercises;

public class DecimalPart {

    private float decimalPart;

    public float countDecimalPart(float number) {

        int integerPart = (int)(number);
        decimalPart = number - integerPart;

        System.out.println("Decimal Part: " + decimalPart);
        return decimalPart;
    }
}
