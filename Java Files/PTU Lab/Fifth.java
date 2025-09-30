// 5. Write a program through Java that reads a number in inches and converts it to meters.

public class Fifth {
    public static void main(String[] args) {
        final double INCHES_PER_METER = 39.3700787402; // inches in 1 meter
        double inches = 50.0;
        double meters = inches/INCHES_PER_METER;
        System.out.printf("%.2f inches in meters are: %.2f%n", inches,meters);
    }   
}
