package com.src;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueEx {

	public static void main(String[] args) 
	{
		LinkedBlockingQueue oLinkedBlockingQueue=new LinkedBlockingQueue();		
		oLinkedBlockingQueue.add(new Student(1,"udit","goa"));
		oLinkedBlockingQueue.add(new Student(2,"ram","uk"));
		oLinkedBlockingQueue.add(new Student(3,"lakshman","up"));
		oLinkedBlockingQueue.add(new Student(4,"bharat","delhi"));
		oLinkedBlockingQueue.add(new Student(5,"rawan","ap"));	
		System.out.println(oLinkedBlockingQueue);		
		System.out.println(oLinkedBlockingQueue.poll());
		System.out.println(oLinkedBlockingQueue.peek());		
	}

}