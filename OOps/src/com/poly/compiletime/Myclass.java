package com.poly.compiletime;

public class Myclass {
	Myclass(){
		System.out.println("default");
	}
	Myclass(int a,int b){
		System.out.println("int parameter");
	}
	Myclass(String a){
		System.out.println("String parameter");
	}
	public static void main(String[] args) {
		Myclass obj=new Myclass(10,20);
		
		
	
	}

}
