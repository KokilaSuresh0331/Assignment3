package assignment3;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Multiplication Table Of A Given Number ");
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		System.out.println("Multiplication Table");
	  System.out.println("********************");
		for(int i=1;i<=10;i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	sc.close();
	}

}
