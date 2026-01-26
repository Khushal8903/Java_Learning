class BankAccount
{   private int balance=100;
   public synchronized void updateBalance(int amount)
   {
       int temp=balance;
	   System.out.println(Thread.currentThread().getName()+"  reads balance "+balance);
	   temp=temp+amount;
	   try{
	      Thread.sleep(200);
	   }
	   catch(Exception ex)
	   {  System.out.println(ex);
	   }
	   balance=temp;
System.out.println(Thread.currentThread().getName()+"  Writes new  balance "+balance);
   }
   public int getBalance()
   { return balance;
   } 
}
class Trans extends Thread 
{  BankAccount bankAccount;
   int value;
   Trans(BankAccount bankAccount,int value)
   { this.bankAccount=bankAccount;
     this.value=value;
   }
   public void run()
   {  bankAccount.updateBalance(value);
   }
}
public class Q1
{ public static void main(String x[])throws Exception
  {  BankAccount account=new BankAccount();
      Trans deposit=new Trans(account,50);
	  deposit.setName("Deposit");
	  
	  Trans wid=new Trans(account,-50);
	  wid.setName("Widraw");
	  deposit.start();
	  wid.start();
	  deposit.join();
	  wid.join();
	  System.out.println("final balance  "+account.getBalance());
  }  
}
