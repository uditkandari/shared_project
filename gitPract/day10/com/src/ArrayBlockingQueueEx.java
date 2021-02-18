package com.src;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {

	public static void main(String args[]) {
		ArrayBlockingQueue<Student> oArrayBlockingQueue=new ArrayBlockingQueue(10);
		
		oArrayBlockingQueue.add(new Student(1,"ww","oo"));
		oArrayBlockingQueue.add(new Student(2,"ee","ii"));
		oArrayBlockingQueue.add(new Student(3,"rr","uu"));
		oArrayBlockingQueue.add(new Student(4,"tt","yy"));
		
		System.out.println(oArrayBlockingQueue);
		oArrayBlockingQueue.poll();
		System.out.println(oArrayBlockingQueue);
		oArrayBlockingQueue.poll();
		System.out.println(oArrayBlockingQueue);
		oArrayBlockingQueue.poll();
		System.out.println(oArrayBlockingQueue);
		oArrayBlockingQueue.poll();
		System.out.println(oArrayBlockingQueue);
		oArrayBlockingQueue.poll();
		System.out.println(oArrayBlockingQueue);
	}

}