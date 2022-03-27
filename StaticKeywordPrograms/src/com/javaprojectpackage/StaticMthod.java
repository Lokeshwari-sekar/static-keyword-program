package com.javaprojectpackage;

class DemoStaticMethod{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;
	static {
		college_name="APEC";
	}
	
	DemoStaticMethod(){
		System.out.println("constructor");
	}
	
	static void myMethod() {//static method can access only static data
		//j=9;//j= non static error
		System.out.println("College name="+college_name);
	}
}

public class StaticMthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");
		DemoStaticMethod.myMethod();//way to access static method

	}

}
