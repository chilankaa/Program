package revision.bin;

public class Hier {
public static void main(String[] args) {
	Hier_Child1 obj=new Hier_Child1();
	obj.display();
	obj.childMethod1();
	Hier_Child2 obj1=new Hier_Child2();
	obj1.display();
	obj1.childMethod2();
}
}
