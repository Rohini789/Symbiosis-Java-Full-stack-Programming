package com.poly.compiletime;

import java.util.Scanner;

public class Calculations {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition is" + c);
	}
	
	public static void main(String[] args) {
		Calculations cl = new Calculations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the 1st num");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd num");
		int num2 = sc.nextInt();
		cl.add(num1,num2);
	}

}
