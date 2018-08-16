package com.tapasya;

class Thing {
	public String name;
	public static String description;

}

public class App6 {
	public static void main(String[] args) {
		Thing.description = "I am Pratika";
		System.out.println(Thing.description);

		Thing Thing1 = new Thing();
		Thing1.name = "bob";
		Thing Thing2 = new Thing();
		Thing2.name = "builder";

		System.out.println(Thing1.name);
		System.out.println(Thing2.name);

	}

}
