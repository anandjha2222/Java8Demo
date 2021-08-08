package com.anand.supplier.demo;

import java.util.function.Supplier;

public class GetRandomPassword {

	public static void main(String[] args) {
		
		Supplier<String> pass = () -> {
			Supplier<Integer> digit = () -> (int)(Math.random()*10);
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> character = () -> characters.charAt((int)(Math.random()*29));
			
			StringBuilder password = new StringBuilder();
			
			for(int i=0;i<8;i++) {
				if(i%2==0) {
					password.append(digit.get());
				}else {
					password.append(character.get());
				}
			}
			return password.toString();
		};
		
		
		System.out.println(pass.get());
		System.out.println(pass.get());
		System.out.println(pass.get());
		System.out.println(pass.get());
		System.out.println(pass.get());
	}
}
