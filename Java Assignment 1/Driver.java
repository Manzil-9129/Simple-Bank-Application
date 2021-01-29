import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
    public class Driver {

	      

			public static void main(String[] args) 
			{   
				ArrayList<Integer> accounts=new ArrayList<Integer>();
                accounts.add(1111);
                accounts.add(2222);
                accounts.add(3333);
                accounts.add(4444);
                accounts.add(5555);
                accounts.add(6666);
                
				Random rand= new Random();
                
                
			    String name;
			    int  accountnumber;
			    double balance=500000;
			    
			    double deposit;
			    double withdraw;
			    bankAccount bankaccount=new bankAccount();
			    
				Scanner input=new Scanner(System.in);
				
				//User enters the name 
				System.out.println("Name on the Account ");
				name=input.nextLine();
				
				//User enters the account number
				System.out.println("Enter the Account number ");
				accountnumber=input.nextInt();
				
				
				//Checks if the account number is valid or not 
				if (accounts.contains(accountnumber))
				{
					//User gets an option to select one of the services
					System.out.println("Choose one of the following options : 1)Deposit 2)Withdraw ");
					int select;
			        switch(select=input.nextInt())
					{
			        case 1:
						
							System.out.println("Enter the valid amount ");
							deposit=input.nextDouble();
							
							bankaccount.setBalance(deposit);
						
							System.out.println("Total balance is :" +(balance+bankaccount.getBalance()));
						
							break;
			        case 2:
			        	
			        	System.out.println("Enter the valid amount ");
						withdraw=input.nextDouble();
						
						bankaccount.setBalance(withdraw);
					
						System.out.println("Total balance is :" +(balance -bankaccount.getBalance()));
					
						break;
			        	
			        	
					}
				}
				
				else
				{
					System.out.println(" OOPS!, The account doesnot exits ");
					System.out.println("Do you like to get one: (1-Yes/2-No) ");
					
				    String select2;
					switch (select2=input.nextLine())
					{  
					   
					 case "Yes":
							int rnumbers=rand.nextInt(5000);
							accounts.add(rnumbers);
							
						System.out.println("Your new account number is " +rnumbers);
						
						
						break;
						
					 case "No":
						 System.out.println("Thank you and may see you again ");
					}
					}		
							
							
					
					
				}
				
				
				
				
				
				
				
				/*//User enters the Account balance
				System.out.println(" Enter the Account balance ");
				balance=input.nextDouble();
				
				
				//Prints the account Details 
				System.out.println("Your Account details ");
				System.out.println("Name: "+name);
				System.out.println("Account number " +accountnumber);
				System.out.println("Balance :" +balance);*/
				
				
				
				
				
		        
		        
    }				
				
				
				


		
			
			
    
