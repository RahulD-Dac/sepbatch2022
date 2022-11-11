import java.util.*;
/*
. Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three fields. This class 
also has a method “volume()” to calculate the volume of this room. Create another class “RoomDemo” which will 
use the earlier class, create instances of rooms, and display the volume of room

*/
class Room 	{
		int height;
		int width;
		int breadth;
		
		public Room(int x ,int y ,int z )
		{
			 height=x;
			 width=y;
			 breadth=z;
		}
	 public int	volume()
	   {
		 
		 return height*breadth*width;
	    }
	   
   }
    
 class RoomDemo
 { 
     public static void main(String[] args)
	{
         Room r1 = new Room(47,56,78);
 		 System.out.println("Room volume    =" +r1.volume());
     }
}


