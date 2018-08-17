package com.tapasya;

class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogs extends Animals {
	void bark() {
		System.out.println("barking...");
	}
}

class Cats extends Animals {
	void meow() {
		System.out.println("meowing...");
	}
}

class TestInheritance3 {
	public static void main(String args[]) {
		Cats c = new Cats();
		c.meow();
		c.eat();

		Dogs d = new Dogs();
		d.bark();

	}
}
