// 9. Write a Java program to determine the greatest number of three numbers.

public class Ninth {

    public static void main(String[] args) {
        int a = 5, b =3, c=5;
        int great1 = a>b ? a:b;
        int great2 = b>c?b:c;
        int greatest = great1>great2?great1:great2;
        // In case, both great1 and great2 contains same no.
        // that won't be an issue. for even if we haven't
        // added = after >. if condition is false still then we're 
        // going to get the same output
        System.err.println("Greatest no. is: "+greatest);
    }
}