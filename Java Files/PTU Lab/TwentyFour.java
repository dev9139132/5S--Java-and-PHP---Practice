// 24. Write a Java method to count all words in a string.

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
        System.out.print("Count the words in string: ");
        String str = in.nextLine();

        System.out.println("Total no. of words in string "+str+" is: "+countWords(str)); 
    }

    public static int countWords(String str)
    {
        String[] strArr = str.split(" ");
        return strArr.length;
    }
}
