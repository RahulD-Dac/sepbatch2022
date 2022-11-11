
class Account
		{
			
			String accountNumber;
			String holderName;
			double balance;
			
			
		void print() 
		{
			System.out.println(accountNo);
			System.out.println(holderName);
			System.out.println(balance);
						
		}
 	}	 

class SavingsAccount extends Account
	{
		
		float interestRate;
		float calcYearlyInterest()
				{
					return balance * interestRate;
				}		
		Book()
		{
			 			
		}
		Book(int noOfPages,double price,String publisherName)
		{
			noOfpages = noOfpages;
			price = price;
			publisherName= publisherName;
		}
		void print()
		{
			
		System.out.println("Publication Name : " + publisherName);
		System.out.println("Price : " +price);
		System.out.println("No of Pages : " + noOfpages);
			
			
		}
	
	}
	
/*

class CurrentAccount extends Account
	{
		Journal()
		{
			 			
		}
		Journal(int noOfPages,double price,String publisherName)
		{
			this.noOfpages = noOfpages;
			this.price = price;
			this.publisherName= publisherName;
			
		}
		
		
		
		
	}
*/
public class Manager

	{
	public static void main (String [] args)
	{
		 
		 
	}


	
}
