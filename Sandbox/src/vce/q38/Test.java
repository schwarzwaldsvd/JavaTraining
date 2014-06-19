package vce.q38;

import java.util.ArrayList;

public class Test {

	void x (int i){ 
		System.out.println("one");
	}
	void x (String s){ 
		System.out.println("two");
	}
	void x (double d){ 
		System.out.println("three");
	}
	public static void main(String[] args) {
		new Test().x(4.0);
	}

}
