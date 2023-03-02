package revision.bin;

public class MultilevelChild extends MultilevelParent {
public void method() {
	System.out.println("This is child class");
}
public static void main(String[] args) {
	MultilevelChild obj=new MultilevelChild();
	obj.display();
	System.out.println(obj.show(15,5));
	obj.method();
	System.out.println(	"Value of a in parent class "+obj.a);
	obj.a=200;
	System.out.println("Value of a in child class "+ obj.a);
}
}
