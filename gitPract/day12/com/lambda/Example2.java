package com.lambda;

import java.util.function.Function;
public class Example2 {

	public static void main(String[] args) 
	{
		Function<Integer,String> f=(b)->{
			int flag=0;
			String res = null;
		
			for(int i=2;i<b;i++) 
			{
				if(b%i==0) 
				{
					flag=1;
					break;
				}
				if(flag==1)
				{
					res="Not a prime";
				}
				else
				{
					res="prime";
				}
			}
			return res;
		};
		
		Function<Integer,String> f1=(b)->{
			int r,sum=0,temp;    
			String res=null;
	
			temp=b;    
			while(b>0)
			{    
				r=b%10;  
				sum=(sum*10)+r;    
				b=b/10;    
			}    
			if(temp==sum)    
				res="Palindrome";
			else    
				res="Not a palindrome";
			return res;
		};
		
		Function<int[],Integer> f2=(n)->{
			Integer flag=0;

			for(int i=0;i<n.length;i++) 
			{
				flag=flag+n[i];
			}
			return flag;
		};
		
		Function<int[],Integer> f3=(n)->{
			Integer flag=0;

			for(int i=0;i<n.length;i++)
			{
				flag=flag+n[i];
			}
			return flag;
		};
		System.out.println(f.apply(29));
		System.out.println(f1.apply(151));
		System.out.println(f1.apply(150));
		int []n= {6,7,8};
		System.out.println(f2.apply(n));
	}
}
