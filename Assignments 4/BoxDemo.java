import java.util.Scanner;
/*
. Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable 
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
*/
class Box
	{
		int height;
		int width,breadth;
		double a;
		public void box (int x ,int y,int z)
		{
		    height = x;
            width = y;
            breadth = z;
		 
		}
		public void box ()
		{
		   height= width =breadth = 0;
		 
		}
		 
		public void display() {

        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth" + breadth);
		}
	
	
		public int getArea()
		{
			return width * breadth;
		}

		public int getVolume()
		{
			return height * width * breadth;
		}
 
	public static void main (String [] args)
	{
		 
		
		Box b1 = new Box(4,5,6);
		Box b2 = new Box(2,7,6);
		
		System.out.println("Volume of Box 1 : " + b1.getVolume());
        System.out.println("Volume of Box 2 : " + b2.getVolume());
        
        System.out.println("Area of Box 1 :"+ b1.getArea());
        System.out.println("Area of Box 2 :"+ b2.getArea());		
		 
		
	}


	
}
