package com.tapasya;

class Birds {
	void eat() {
		System.out.println("eating...");
	}
}

class Sparrow extends Birds {
	void chrip() {
		System.out.println("chipring...");
	}
}

class Babysparrow extends Sparrow {
	void weep() {
		System.out.println("weeping...");
	}
}

class TestInheritance2 {
	public static void main(String args[]) {
		Babysparrow d = new Babysparrow();
		d.weep();
		d.chrip();
		d.eat();
		
	}
}
