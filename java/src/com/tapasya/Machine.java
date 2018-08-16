package com.tapasya;
class Frog {
	 private String name;
	 private int age;
	
	 void setName(String name) {
		
		This.name= name;
	}
	
     public void setAge(int age) {

		This.age= age;
	}
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	 public void setInfo(String name , int age) {
		
		setName(name);
		setName(age);

}

public class App4 {

	public static void main(String[] args) {
		frog frog1 = new frog();
		
//		frog1.name = "lucy";
//		frog1.age = 2;
		
		frog1.setName("cherry");
		frog1.setAge(22);
		

	}

}
