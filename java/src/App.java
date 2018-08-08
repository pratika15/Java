
class Person {
	String name;
	int age;


void Speak() {
	System.out.println("Hello");
	
}
}

public class App {

	public static void main(String[] args) {

		Person Person1 = new Person();
		Person1.name = "pratika";
		Person1.age = 22;
		Person1.Speak();

		Person Person2 = new Person();
		Person2.name = "Bhanu";
		Person2.age = 34;
		Person2.Speak();
		

		System.out.println(Person1.name);
		System.out.println(Person1.age);
		System.out.println(Person2.name);
		System.out.println(Person2.age);

	}

}
