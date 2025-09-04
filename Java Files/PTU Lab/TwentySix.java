// 26. Write a Java program to handle the following exceptions:
//     - Divide by Zero Exception.
//     - Array Index Out of Bound Exception.

public class TwentySix {
    public static void main(String[] args) {
        try
        {
            int div = 5/0;
            System.out.println(div);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        try{
            int[] array = {0,1,2,3};
            int len = array.length;
            System.out.println("Array length: "+len);
            System.out.println("array[4]: "+array[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Main continued");
    }
}
