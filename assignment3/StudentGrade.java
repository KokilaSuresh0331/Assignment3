package assignment3;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's score as input and outputs their corresponding grade");
        System.out.print("Enter Student's Name: ");
        String name = sc.next();
        System.out.print("Enter Student's m1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Student's m2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Student's m3: ");
        int m3 = sc.nextInt();
        System.out.print("Enter Student's m4: ");
        int m4 = sc.nextInt();
        System.out.print("Enter Student's m5: ");
        int m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0; 

        System.out.println("Student Name: " + name);
        System.out.println("Student Total mark is: " + total);
        System.out.println("Student average mark is: " + avg);

        // Determine grade based on average score
        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade: A");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Grade: B");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Grade: C");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade: D");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
	}