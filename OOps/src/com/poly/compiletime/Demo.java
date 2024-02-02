package com.poly.compiletime;

public class Demo {
	public static void m1() {
		System.out.println("no paramaeter m1");
	}
	public static void m1(int a) {
		System.out.println("with int paramaeter m1");
	}
   public static void m1(String a) {
	System.out.println("with String paramaeter m1");
   }
   public static void main(String[] args) {
	   Demo.m1();
	   Demo.m1("Prajyot");
	   
   }
}// static method m1 is overload beacuse 
   // they have different parameter
   // so they can individually and seperatly executed accordingly
   
  
