package assignment3;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Get three numbers from the user and print the greatest number.");
		int a,b,c;
		System.out.print("Enter a value:");
		a=sc.nextInt();
		System.out.print("Enter b value:");
		b=sc.nextInt();
		System.out.print("Enter c Value:");
		c=sc.nextInt();
		int greatest=(a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("The greatest number is:"+greatest);
		sc.close();
			
	}
	

}
