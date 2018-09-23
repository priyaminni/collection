package com.oop.practice;

class B {
	void show() {
		System.out.println("B - show");
	}
}

class C extends B {
	void show() {
		System.out.println("C - show");
	}
}

public class OverRidingTest {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		C obj2 = new C();
		obj2.show();
		B obj3=new C();
		obj3.show();
	}

}
