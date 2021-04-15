package com.codes;


 class A {
	public void show() {
		System.out.println("A");
	}
}
 
 
public class Polymorphishm extends A {
@Override
	public void show() {
		System.out.println("Polymorpism");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A a = new A();
//		A a1 = new Polymorphishm();
	Polymorphishm b = new Polymorphishm();
	//	Polymorphishm b1= (Polymorphishm) new A();
		b.show();
	}

}
