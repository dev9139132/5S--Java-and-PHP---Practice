// 4. Write a program to convert temperature from Fahrenheit to Celsius using Java

public class Fourth {
    public static void main(String[] args){
    float fahrenheit = 55;
    float celsius = (fahrenheit-32)*(5/9.f);
    System.out.printf("%.0f°F in °C is: %.2f%n", fahrenheit, celsius);
    }   
}

// Explanation of System.out.printf
// %.2f: Formats the number to 2 decimal places.
// %n: Adds a newline at the end.