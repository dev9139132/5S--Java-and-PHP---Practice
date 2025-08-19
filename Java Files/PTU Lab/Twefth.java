// 12. Write a program to sum values of a single-dimensional array.

import java.util.Arrays;

public class Twefth {  
public static void main(String[] args) {
    
    int[] arr = {1,5,3,5,2,5};

    int sum =0;
    for(int i=0;i<arr.length;i++)
    {
        sum += arr[i];
    }

    System.out.println("\nSum of single dimensional array "+Arrays.toString(arr)+" is: "+sum+"\n");
   
} 
}
