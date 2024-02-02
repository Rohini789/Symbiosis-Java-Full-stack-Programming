package Shopmain;

import java.util.Scanner;

public abstract class Mobiles implements MyShop{
	
	public static void getMobilesinfo() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter 1:iphone\nenter 2:Samsung");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Iphone.getinfo();
			break;
		case 2:
			Samsung.getinfo();
			break;
		default:
			System.out.println("invalid choice");
		}
		
	}

}