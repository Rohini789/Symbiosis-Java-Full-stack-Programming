package Shopmain;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		int c;
		// TODO Auto-generated method stub
		do {
		System.out.println("press 1:mobile\npress 2:Tv\npress 3:Ac");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			Mobiles.getMobilesinfo();
			break;
		case 2:
			Tv.getTv();
			break;
		case 3:
			Ac.getAc();
		default:
			System.out.println("invalid choice");
		}
		System.out.println("do you want to continue:1-yes/0-no");
		 c=s.nextInt();
		}while(c!=0);
	}

}