package com.util.practice;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		ArrayList al1 = new ArrayList();
		al.add(670.999);
		al1.add("STRING");
		al1.add(new Integer(89));
		al1.add(new Date(12 / 16 / 1996));
		System.out.println(al);
		System.out.println(al1);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al1.get(i));
			
		}
		System.out.println("----------------------");
		for (int j = 0; j < al1.size(); j++) {
			System.out.println(al1.get(j));
		}
		al.remove(0);
		al.add(0,23.00);
		System.out.println(al);
		Object i[]=al.toArray();
		double sum=0;
		for(int k=0;k<al.size();k++) {
			sum=sum+(double)i[k];
		}
		System.out.println("The sum is "+sum);
	}
}
