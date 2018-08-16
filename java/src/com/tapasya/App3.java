package com.tapasya;

class frog {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class App3 {

	public static void main(String[] args) {
		frog frog1 = new frog();
		frog1.name = "lucy";
		frog1.age = 2;
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
				

	}

}
