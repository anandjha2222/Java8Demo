package com.anand.method.and.constructor.reference.demo;

public class MethodReferenceDemo {

	public static void m2() {
		System.out.println("A method which is already there in library or anywhere");
	}
	
	public static void main(String[] args) {
		Interf i = MethodReferenceDemo::m2;  
		
		/*NOTE : no need of lambda here, we simply referred m2() as we wanted the same implementation of m1()
		Only rule for using method reference is that argument types of m1() and m2() must be same
		
		for static method
			ClassName::methodName
		for Instance method
			ObjectReference::methodName
		*/
		
		i.m1();
	}
}
