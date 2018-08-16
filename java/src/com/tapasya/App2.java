package com.tapasya;
class Robot {
	public void speak(String text) {
		System.out.println(text);

	}

	public void jump(int height) {
		System.out.println("jumping:" + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving:" + distance + "meters in direction" + direction);
	}
}

public class App2 {

	public static void main(String[] args) {
		Robot sam = new Robot();
		
		sam.speak("hi. i m sam");
		sam.jump(5);
		sam.move("west", 12.2);
	}

}
