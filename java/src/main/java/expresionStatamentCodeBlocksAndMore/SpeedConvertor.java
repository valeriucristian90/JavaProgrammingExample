package expresionStatamentCodeBlocksAndMore;

public class SpeedConvertor {

    public static long kilometersToMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else{
            long milesPerHour = kilometersToMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }

    }

    public static void main(String[] args) {
        printConversion(100);
    }
}
