// 11. Construct a Java program to find the number of days in a month.

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m;
            String choice;
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        
        while(true){
        while (true) {
            System.out.print("Enter month no. b/w 1 and 12: ");
            m = in.nextInt(); // m, short for month
            if (m >= 1 && m <= 12) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        int day = (m == 2) ? 28 : ((m == 4 || m == 6 || m == 9 || m == 11) ? 30 : 31);

        System.out.println("No. of days in "+months[m-1]+" month: " + day);
    
        System.out.print("Do you want to try again? Y/N: ");
        in.next
        choice = in.nextLine();

        if(choice!="a" || choice!="A")
        {
            break;
        }

        
    }
        in.close();
    }
}
