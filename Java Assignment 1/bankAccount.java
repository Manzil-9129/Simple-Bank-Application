import java.io.PrintStream;

public class bankAccount {

		
     
	//Instance variables
		private double _accountNumber;
		private String _name;
		private double _balance;
	
		//Constructor
		/*public bankAccount(double Accountnumber,String Name,double Balance)
		
		{
			this._accountNumber=Accountnumber;
			this._name=Name;
			this._balance=Balance;
			
		}*/
		
		//Properties
		
		//Account number(Getter and setter)
		public double getAccountNumber()
		{
			return this._accountNumber;
			}	
		
	    public void setAccountNumber(double __accountnumber)
	    {
	    	this._accountNumber=__accountnumber;
	    }
		
	    
	    //Name (Getter and setter)
	     public String getName()
	     {
	    	 return this._name;
	     }
	     
	     public void setName(String __name)
	     {
	    	 this._name=__name;
	    	 
	     }
	     
	     //Balance (Getter and setter)
	     public double getBalance()
	     {
	    	 return this._balance;
	     }
		 
	     public void setBalance(double __balance)
	     {
	    	 this._balance=__balance;
	    	 
	     }
		
		
		
	     //Method to Deposit the money in account 
	     
	     public double depositMoney(double amount )
	     {   
	    	 if(amount>0)
	     {
	    	 this._balance=(_balance+ amount);
	    	 return this._balance;
	     }
	    	 else
	    	 {
	    		 return 0;
	    	 }
	     }
		
	     
	     //Method to withdraw the money from the account 
	     
	     public double withDraw(double amount)
	     {   if (amount<=this._balance)
	     {
	    	 this._balance=_balance-amount;
	    	 return this._balance;
	     }
	     else
	     {
	    	 return 0;
	     }
	     }
	     
	     
	     //Method to retrieve the account information 
	     public String getAccountinfo()
	     {
	         return String.format("%s :%n %d :%n %d :",this._name,this._accountNumber,this._balance);
	     }
	

}
