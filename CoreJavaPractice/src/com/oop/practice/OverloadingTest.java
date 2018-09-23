package com.oop.practice;

class A {
	A() {
		System.out.println("A Default constructor");
	}

	A(int a) {
		System.out.println("A with a single int param");
	}

	A(int a, int b) {
		System.out.println("A with two int params");
	}

	A(boolean b) {
		System.out.println("A with boolean param");
	}

	A(double d) {
		System.out.println("A with double param");
	}

	void show() {
		System.out.println("show - no params");
	}

	void show(int a, int b) {
		System.out.println("show - two int params");
	}

	void show(float f) {
		System.out.println("show - float param");
	}

	int add(int a, int b) {
		return (a + b);
	}

	double add(double d1, double d2) {
		return (d1 + d2);
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		A obj = new A(1, 2);
		obj.show(1.0f);
		int d1 = 22;
		int d2 = 34;
		System.out.println("Sum of " + d1 + " and " + d2 + " is: " + obj.add(d1, d2));
	}

}
