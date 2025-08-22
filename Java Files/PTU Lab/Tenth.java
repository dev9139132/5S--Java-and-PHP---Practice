// 10. Write a program that gets a number from the user and generates an integer between 1 and 7. Subsequently, it should display the name of the weekday as per that number.

import java.util.Scanner;

public class Tenth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. b/w 1 and 7: ");
        int num = in.nextInt();

        // switch (num) {
        //     case 1:
        //         System.out.print("Monday");
        //         break;
        //     case 2:
        //         System.out.print("Tuesday");
        //         break;
        //     case 3:
        //         System.out.print("Wedday");
        //         break;
        //     case 4:
        //         System.out.print("Thursday");
        //         break;
        //     case 5:
        //         System.out.print("Friday");
        //         break;
        //     case 6:
        //         System.out.print("Saturday");
        //         break;
        //     case 7:
        //         System.out.print("Sunday");
        //         break;
        //     default:
        //         System.out.print("Wrong input. Enter no. only b/w 1 and 7");
        //         break;
        // }

        System.out.println(weekDay(num));

        
    }

    public static String weekDay(int num) 
    {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        switch (num) {
            case 1:
                return weekDays[num-1];               
            case 2:
                return weekDays[num-1];                
            case 3:
                return weekDays[num-1];               
            case 4:
                return weekDays[num-1];
            case 5:
                return weekDays[num-1];               
            case 6:
                return weekDays[num-1];
            case 7:
                return weekDays[num-1];               
            default:
                return "Wrong input. Enter no. only b/w 1 and 7";
                
        }  
    }

}