import java.util.*;
import java.lang.*;

interface Shape
{
         double  area();
		 
		 
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
/*
class Rectangle  implements Shape
{
	double len;
	double br;
	
	Rectangle()
	{
	
	}
	
	Rectangle(double len, double br)
	{
		this.len = len;
		this.br = br;
		System.out.println("Rectangle constructor");
	}
	
	void calArea()
	{
		area = len * br;
	}
}



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
class interfaceSheaps
{
        public static void main(String args[])
        {
			
			double radius= 2.5;
			Shape  ms;
			
            Circle c1= new Circle(radius);	
			c1.area();
			
			//System.out.prinln("Circle -Area "+ c1.area());
			
     }
}
