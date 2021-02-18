package com.lambda;


import java.util.function.IntBinaryOperator;

public class Example3 {

	public static void main(String[] args) {

		IntBinaryOperator addition = (a, b) -> a + b;
		System.out.println("Result: "+addition.applyAsInt(12, 20));

		IntBinaryOperator substraction = (a, b) -> a - b;
		System.out.println("Result: "+substraction.applyAsInt(50, 20));

		IntBinaryOperator multiplication = (a, b) -> a * b;
		System.out.println("Result: "+multiplication.applyAsInt(10, 20));


	}

}