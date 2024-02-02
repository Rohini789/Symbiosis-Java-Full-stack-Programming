package Shopmain;

import java.util.Scanner;

public abstract class Ac implements MyShop {

	public static void getAc() {
		// TODO Auto-generated method stub
		System.out.println("press 1:Star\npress 2:Blue");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			Star.getinfo();
			break;
		case 2:
			Blue.getinfo();
			break;
		default:
			System.out.println("invalid choice");
		}
	}

	
}

