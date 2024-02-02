package Shopmain;

import java.util.Scanner;

public abstract class Tv implements MyShop {

	public static void getTv() {
		// TODO Auto-generated method stub
		System.out.println("press 1:LG\npress 2:Sony");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			Lg.getinfo();
			break;
		case 2:
			Sony.getinfo();
			break;
		default:
			System.out.println("invalid choice");
		}
		
	}

	
}