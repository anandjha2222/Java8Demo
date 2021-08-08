package com.anand.method.and.constructor.reference.demo;

public class ThreadUsingMethodReference {

	void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		ThreadUsingMethodReference threadUsingMethodReference = new ThreadUsingMethodReference();
		Runnable r = threadUsingMethodReference::m1;
		
		new Thread(r).start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}
