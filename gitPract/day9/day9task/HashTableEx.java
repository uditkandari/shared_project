package day9task;

import java.util.HashMap;

//import day9clss.Customer;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap oHashMap=new HashMap();
		oHashMap.put(new Customer(1,"uk","fan"),"usha");
		oHashMap.put(new Customer(2,"sk","chair"),"pvc");
		oHashMap.put(new Customer(2,"dk","freeze")," lg");
		oHashMap.put(new Customer(4,"gk","mobile")," nokia");
		System.out.println(oHashMap);
		
		
	}
}
