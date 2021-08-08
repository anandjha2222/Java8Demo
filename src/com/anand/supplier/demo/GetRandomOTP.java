package com.anand.supplier.demo;

import java.util.function.Supplier;

public class GetRandomOTP {

	public static void main(String[] args) {
		
		Supplier<String> otp = () -> {
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<6;i++) {
				sb.append((int)(Math.random()*10));
			}
			
			return sb.toString();
		};
		
		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
		System.out.println(otp.get());
	}
}
