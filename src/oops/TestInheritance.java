package oops;

class Parent {
	void eat() {
		System.out.println("Parent...");
	}
}

class Child extends Parent {
	void eat() {
		System.out.println("Child...");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent pp = new Parent();
//		pp.eat();
		Child cc = new Child();
//		cc.eat();
		Parent pc = new Child(); 
		pc.eat();

	}

}
