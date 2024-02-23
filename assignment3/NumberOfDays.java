package assignment3;

import java.util.Scanner;

public class NumberOfDays {
public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month(1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month input: " + month);
            return;
        }

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Number of days in month " + month + ": 31");
                break;
            case 4, 6, 9, 11:
                System.out.println("Number of days in month " + month + ": 30");
                break;
            case 2:
                if (isLeapYear) {
                    System.out.println("Number of days in month " + month + ": 29 (Leap Year)");
                } else {
                    System.out.println("Number of days in month " + month + ": 28");
                }
                break;
        }

        sc.close();
    
        
    }
	
}

