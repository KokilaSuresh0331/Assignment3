package assignment3;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print factorial of given number");
		System.out.println("*******************************");
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Fact Value:"+fact);
	}

}
