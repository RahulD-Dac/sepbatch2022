import java.util.*;
import java.lang.*;

interface Shape
{
         double area();
		 
		 
}

class Circle implements Shape {
	private double radius;
	 
	 
	public Circle(double radius)
	{
		this.radius= radius;
	}
 
	public double area()
	{
		return Math.PI * radius * radius;
		 
	}
	
	
}

class Rectangle  implements Shape
{
	double len;
	double br;
	
	
	public Rectangle(double len, double br)
	{
		this.len = len;
		this.br = br;
		 
	}
	public double area()
	{
		return len * br;
		 
	}
	
}


/*
class Square implements Shape
{
	double side;
	
	Square()
	{
	
	}
	
	Square(double side)
	{
		this.side = side;
	}
	
	void calArea()
	{
		area = side * side;
	}
}
*/
class InterfacesShapeDemo
{
        public static void main(String args[])
        {
			
			double radius= 2.5;
			double length=4.0;
			double breadth =5.0; 
			
			
			Rectangle r = new Rectangle(length,breadth);
			
			
			System.out.println("Rectangle-Area "+ r.area());
			
            Circle c1= new Circle(radius);	
			//c1.area();
			
			System.out.println("Circle -Area "+ c1.area());
			
     }
}
