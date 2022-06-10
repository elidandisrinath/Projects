package maccess;
import test.*;
import java.util.*;
@SuppressWarnings("serial")
public class BankMainClass extends Exception
{
public BankMainClass(String msg)
{
	super(msg);
}
public static void main(String[]args)
{
Scanner s= new Scanner(System.in);
int count=0;
xyz:
	while(true)
	{
		try {
		System.out.println("Enter your PinNo:");
		int pinNo= s.nextInt();
		PinNoCheck pnc = new PinNoCheck();
		boolean k = pnc.verify(pinNo);
		if(!k)
		{
			BankMainClass ob = new BankMainClass("Invalid PinNo...");
			throw ob;
		}
			System.out.println("======Choice======");
			System.out.println("1.WithDraw\n2.Deposit");
			System.out.println("Enter your Choice:");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the WithDraw amt:");
				int a1 = s.nextInt();
				if (!(a1>0&&a1%100==0))//Exception
				{
					BankMainClass ob = new BankMainClass("Invalid amt...");
					throw ob;
				}
					WithDraw wd = new WithDraw();
					wd.process(a1);
				break xyz;
			case 2:
				System.out.println("Enter the Deposit amt:");
				int a2 = s.nextInt();
				if (!(a2>0&&a2%100==0))//Exception
				{
					BankMainClass ob = new BankMainClass("Invalid amt...");
					throw ob;
				}
					Deposit dp = new Deposit();
					dp.process(a2);
				break xyz;
				default://Exception
					BankMainClass ob = new BankMainClass("Invalid Choice...");
					throw ob;
				}//end of switch
		} //end of try
			catch(BankMainClass ob)
			{
				System.out.println(ob.getMessage());
				if (ob.getMessage().equalsIgnoreCase("Invalid pinNo..."))
				{
				count++;
			if (count==3)
			{
				System.out.println("Transaction blocked...");
				break xyz;
			}
			continue;
				}
				break xyz;	
			}
	}
		s.close();
	}
}
