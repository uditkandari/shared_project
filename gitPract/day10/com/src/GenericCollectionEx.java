package com.src;

import java.util.ArrayList;

interface Shape
{
	void draw();

}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Draw Circle");
	}
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
}
class Square implements Shape
{
	public void draw()
	{
		System.out.println("Draw Square");
	}
}

public class GenericCollectionEx {

	public static void main(String[] args)
	{
		GenericCollectionEx oGenericCollectionEx=new GenericCollectionEx();
		ArrayList oArrayList=new ArrayList();
		Circle oCircle=new Circle();
		Rectangle oRectangle=new Rectangle();
		Square oSquare=new Square();
		oArrayList.add(oCircle);
		oArrayList.add(oRectangle);
		oArrayList.add(oSquare);
		oGenericCollectionEx.call(oArrayList);	
	}

	void call(ArrayList<? extends Shape>list1)
	{
		for(Shape s:list1)
		{
			s.draw();
		}
	}

}