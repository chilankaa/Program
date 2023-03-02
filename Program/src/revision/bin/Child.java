package revision.bin;

public class Child extends Parent {
	public void display() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
	}
}
