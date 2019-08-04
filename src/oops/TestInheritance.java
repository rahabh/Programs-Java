package oops;

class Animal {
	void eat() {
		System.out.println("Parent...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Child...");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal aa = new Animal();
		Animal ad = new Dog();
		//Dog da = (Dog) new Animal();
		Dog dd = new Dog();
		
		aa.eat();
		ad.eat();
		dd.bark();
		dd.eat();
		//da.bark();
	//	da.eat();
		
		/*
		 * Dog d=new Dog(); d.bark(); d.eat();
		 */
	}

}
