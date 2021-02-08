package com.gitPract;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three no: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		System.out.println(((number1>number2 && number1>number3)?number1:(number2>number1 && number2>number3)?number2:number3));

	}

}
