package com.lambda;

import java.util.function.Function;

public class Example5 {
	public static void main(String[] args)
	{
		Integer[] a= {1,2,99,45};
		Function<Integer[],Integer> f=(n)->{
			int sum=0;
			int i;
			for(i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			return sum;};
			System.out.println(f.apply(a));
	}
}

