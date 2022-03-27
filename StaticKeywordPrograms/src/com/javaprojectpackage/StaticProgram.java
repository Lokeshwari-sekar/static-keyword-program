package com.javaprojectpackage;

class School
{
	static String schoolname;
	int rollno;
	
	School()

	{
		schoolname="ABD";
		rollno=10;
	}
	
	void display()

	{
		System.out.println("static variable"+schoolname);
		System.out.println("non static variable"+rollno);
	}
}

public class StaticProgram {

	public static void main(String[] args) {
		School sc=new School();
		School sc1=new School();
		sc.display();
		sc1.display();

	}

}
