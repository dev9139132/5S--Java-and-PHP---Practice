// 5. Write a program through Java that reads a number in inches and converts it to meters.

public class Fifth {
    public static void main(String[] args) {
        final double ONE_INCH = 39.3700787402; // meters
        double inches = 50.0;
        double meters = inches/ONE_INCH;
        System.out.printf("%.2f inches in meters are: %.2f%n", inches,meters);
    }   
}
