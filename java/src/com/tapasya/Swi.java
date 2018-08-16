package com.tapasya;
import java.util.Scanner;

public class Swi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("enter your command");

		String text = input.nextLine();

		switch (text) {

		case "start":
			System.out.println("Machine started");
			break;

		case "stop":
			System.out.println("Machine stopped");
			break;

		default:
			System.out.println("command not recognized");

		}

	}

}
