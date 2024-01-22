package com.sri.JDBCProject;

public class Tree {
	public double height=20.5;
	public Tree() {
		System.out.println("Tree Constructor");
	}
	static {
		System.out.println("Tree Static Block");
	}
	public void grow() {
		System.out.println("Tree grow");
	}
}
