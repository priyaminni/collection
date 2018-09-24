package com.util.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Set<String> aa = new HashSet<String>();
		String[] m = { "ALL", "BLL", "CLL", "ALL", "AALL" };
		for (int i = 0; i < m.length; i++) {
			if (!aa.add(m[i])) {
				System.out.println(m[i]);
			}
		}

	}

}
