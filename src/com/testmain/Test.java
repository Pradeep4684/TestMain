package com.testmain;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
	   list.stream().forEach(x->System.out.println(x));
		}
	}

