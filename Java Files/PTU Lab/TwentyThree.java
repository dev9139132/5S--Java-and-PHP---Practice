// ,23. Write a program and design a method to count all vowels in a string.

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Count the vowels in string: ");
        String str = in.nextLine();

        System.out.println("Total no. of vowels in string "+str+" is: "+countVowels(str)); 
    }

    public static int countVowels(String str)
    {
        char[] vowels = {'a','e','i','o','u'};
        str = str.trim();
        str = str.toLowerCase();
        int count = 0;
        for(char character: str.toCharArray())
        {   
            for(char vowel: vowels)
            {
            if(character==vowel)
            {
                count++;
                break;
            }
        }
    }
        return count;

    }
}
