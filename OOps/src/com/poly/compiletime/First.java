package com.poly.compiletime;

public class First {
	public void m1() {
		System.out.println("no parameter");
	}
	public void m1 (int a) {
		System.out.println("parameter with int");
	}
		public void m1(String a) {
			System.out.println("String parameter");
		}
		public void m1(float a) {
			System.out.println("float parameter");
		}
		 public static void main(String[] args) {
			 First ft = new First();
			 ft.m1(20);
			 ft.m1("KBP");
			
		}
	}


