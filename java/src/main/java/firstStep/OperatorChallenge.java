package firstStep;

public class OperatorChallenge {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double sum = (firstValue + secondValue) * 100.00;
        System.out.println(sum);

        double remainder = sum % 40.00;
        System.out.println(remainder);

        boolean isRemainder = remainder == 0;

        System.out.println(isRemainder);

        if(!isRemainder){
            System.out.println("Got some remainder");
        }
    }
}
