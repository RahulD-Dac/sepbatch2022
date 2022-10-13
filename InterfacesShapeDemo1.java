import java.util.*;
import java.lang.*;

interface Shape
{
        
		void printArea();
		//double area();
		 	 
}

class Circle implements Shape {
	 double radius;
	 //public double area();
	 
	//public void printArea(){ 
	
	  double sum;
			
			void Circle ( double radius)
			{
				this.radius= radius;
			}
 
	 public void printArea()  
	{
		sum= Math.PI * radius * radius;
		System.out.println("Circle -Area "+ sum) ;
	}
	
	//}
}
/*
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
class InterfacesShapeDemo1
{
        public static void main(String args[])
        {
					
			
			double radius= 2.5;
			//double length=4.0;
			//double breadth =5.0; 
			
			
			//Rectangle r = new Rectangle(length,breadth);
			
			
			//System.out.println("Rectangle-Area "+ r.area());
			
            //Circle c1= new Circle(radius);	
			//c1.printArea();
			
			Shape inshape = new Circle(radius);
			inshape.printArea();
			
			//System.out.println("Circle -Area "+ c1.area());
			
     }
}
