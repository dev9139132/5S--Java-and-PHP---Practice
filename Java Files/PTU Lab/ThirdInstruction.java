// 3. Write a Java program to compute the area of:
//    - Circle
//    - Rectangle
//    - Triangle
//    - Square

public class ThirdInstruction {
    public static void main(String[] args) {

       final double PIE = 3.14;
       double radius = 5;
       double areaC = PIE * (radius*radius);
       System.out.println("Area of circle is: "+ areaC);

       double length = 3;
       double breadth = 3;
        double areaR = length*breadth;
        System.out.println("Area of rectangle is: "+areaR);

        double base = 5;
        double height = 5;
        double areaT = (base*height)/2;
        System.out.println("Area of triangle is: "+ areaT);

        double side = 3;
        double areaS = side*side;
        System.out.println("Area of square is: "+areaS);

       
    }
    
}
