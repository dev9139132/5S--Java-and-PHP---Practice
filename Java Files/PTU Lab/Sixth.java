// 6. Write a program to convert minutes into a number of years and days.

public class Sixth {

    public static void main(String[] args) {
        final int MINS_PER_DAY = 60*24;
        final int MINS_PER_YEAR = MINS_PER_DAY * 365;
        int justMins = 2000;

        System.out.println("Day: "+justMins/MINS_PER_DAY);
        System.out.println("Year: "+justMins/MINS_PER_YEAR);
    }
}