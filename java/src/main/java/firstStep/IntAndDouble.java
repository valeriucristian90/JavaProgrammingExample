package firstStep;

public class IntAndDouble {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = 10 + 5 + 2 * 10;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int total = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - total;

        System.out.println(total);
        System.out.println(myLastOne);

        float minValue = Float.MIN_VALUE;
        float maxValue = Float.MAX_VALUE;

        System.out.println("Float min value is " +  minValue);
        System.out.println("Float max value is " +  maxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;

        System.out.println("Double min values is " + doubleMinValue);
        System.out.println("Double max values is " + doubleMaxValue);

        int pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms);

        double anotherNumber = 3_00_000.245_210;
        System.out.println(anotherNumber);
    }
}
