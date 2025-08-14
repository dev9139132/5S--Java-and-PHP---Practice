// 8. Design a program in Java to solve quadratic equations using `if` and `else`.

//The Math.sqrt() method is a static method of the java.lang.Math class, meaning you can call it directly using the class name without creating an object.
// squarroot = M
public class Eigth {

    public static void main(String[] args) {
        
        int a = 1, b =4,c=5;
    double d = (b*b)-(4*a*c);
    // double d = 0; // to get equal roots
        // double d = 1; // to get ifferent real roots
    
    if(d>=0)
    {   
        double root1 = ((-b)+(Math.sqrt(d)))/(2*a);
        double root2 = ((-b)-(Math.sqrt(d)))/(2*a);
        if(d>0)
        {
        System.out.println("D > 0: The quadratic equation has two distinct real roots: ");
        System.out.printf("Root1: %.2f, Root2: %.2f%n",root1,root2);
        }
        else
        {
            System.out.println("Bcs D = 0: The quadratic equation has two equal real roots (a repeated root): ");
        System.out.printf("Root1: %.2f, Root2: %.2f%n",root1,root2);
        }
    }
    else
    {   
        System.out.println("Bcs D < 0: The quadratic equation has two complex (non-real) roots:");
        double real = (-b)/(2*a);
        double imag = (Math.sqrt(-(d)))/(2*a);
        if(imag!=1)
        {
            System.out.printf("Root1: %.0f + %.0fi, Root2: %.0f - %.0fi%n", real, imag, real, imag);
        }
        else
        {
        System.out.printf("Root1: %.0f + i, Root2: %.0f - i%n", real, real);
        }
    }   
}
}