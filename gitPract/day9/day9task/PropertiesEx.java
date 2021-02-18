package day9task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx 
{
	public static void main(String[] args) throws IOException 
	{		
		FileReader reader=new FileReader("file.propertie");
		Properties oProperties=new Properties();
		oProperties.load(reader);
		System.out.println(oProperties.getProperty("name"));
		System.out.println(oProperties.getProperty("password"));		
		System.out.println("new properties");
		Properties p3=new Properties();
		p3.put("udit", "kandari");
		p3.put("happy","singh");
		System.out.println(p3);

		Properties oProperties1=System.getProperties();    
		Set set=oProperties1.entrySet();
		Iterator oIterator=set.iterator();
		while(oIterator.hasNext())
		{
			Map.Entry oEntry=(Entry) oIterator.next();
			System.out.println(oEntry.getKey()+" "+oEntry.getValue());


		}
		System.out.println("CREATEING FILE");

		Properties oProperties4 = new Properties(); 

		oProperties4.setProperty("name","UDIT"); 
		oProperties4.setProperty("email","udit.kandari@gmail.com"); 

		oProperties4.store(new FileWriter("info.properties"),"Day9"); 
		oProperties4.load(reader);
		System.out.println(oProperties4.getProperty("name"));
		System.out.println(oProperties4.getProperty("email"));

	}

}

