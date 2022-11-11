import java.util.Scanner;

abstract class Publication
	{
		int noOfpages;
		double price ;
		String publisherName ;		
		abstract void print();
		
	}	

class Book extends Publication
	{
		 
		double price ;
		String publisherName ;			
		Book()
			 {
			 publisherName = "noPublisher";
			 price = 0;
			 int noOfPages = 0;
			 }
		Book(int np,double p,String pubName)
		{
			noOfpages = np;
			price = p;
			publisherName = pubName;
		}
		
	
	}
	


class Journal extends Publication
	{
		Journal()
		{
			
			
			 publisherName = "noPublisher";
			 price = 0;
			 int noOfPages = 0;
			  			
		}
		Journal(int np,double ,String pubName)
		{
			noOfpages = np;
			price = p;
			publisherName = pubName;
			
		}
		
		
		
		
	}
*/
public class Library

	{
	public static void main (String [] args)
	{
		int size =3;
		Library b1[] = new Library[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("book 3 Details : " );
		
		
		for(int i=0;i<size;i++)
		{
			int noOfpages = sc.nextInt();
			double price = sc.nextDouble();
			String publisherName = sc.nextLine();
			b1 =new Book();
			b1[i].print();
			//b1[i] = new book (noOfPages,price,publisherName);
		}
		
		//b1[i] = new book (noOfPages,price,publisherName);
		
		//b1.Book(500,630.00,"myBook2");
		//lib[1] = new Book(500,630.00,"myBook2");
		//lib[2] = new Book(500,630.00,"myBook2");
		/* 
		for(int i=0;i<size;i++)
		{
			System.out.println(b1[i].print());

		}
	
		
		//Book b2 = new Book(500,630.00,"myBook2");
		//b1.print();

		//Book b3 = new Book(400,830.00,"myBook3");
		//b1.print();
		
/*Journal j1 = new Journal(100,50.0,myjournal1);
		j1.print();
        Journal j2 = new Journal(200,50.0,myjournal2);
		j2.print();
*/
		//Library L = new Library(b1);
		
	}


	
}
