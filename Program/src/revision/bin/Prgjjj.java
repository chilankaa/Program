package revision.bin;

import java.util.Scanner;



public class Prgjjj {
	static String name;
	static int age;

	static void name() {
		System.out.println("Enter name and age");
		Scanner sc=new Scanner(System.in);
		name = sc.nextLine();
		age = sc.nextInt();

	}

	static void display() {
		name();
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
	}
	public static void main(String[] args) {
		Prgjjj p=new Prgjjj();
		display();
	}
}
