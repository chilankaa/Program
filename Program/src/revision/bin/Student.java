package revision.bin;

public class Student {
	String name;
	int no;
	StudMark mark;

	Student(String name, int no, StudMark mark) {
		this.name = name;
		this.no = no;
		this.mark = mark;
	}

	public void display() {
		System.out.println("Name of student is " + name);
		System.out.println("Register number of student is " + no);
		System.out.println("Marks of student : S1 - " + mark.s1 + ", S2 - " + mark.s2 + ", S3 - " + mark.s3);
	}

	public static void main(String[] args) {
		StudMark mark = new StudMark(50, 50, 60);
		Student stud = new Student("Chilanka", 21, mark);
		stud.display();
		
		StudMark mark1 = new StudMark(70, 80, 40);
		Student stud1 = new Student("Dhanya", 22, mark1);
		stud1.display();
	}
}
