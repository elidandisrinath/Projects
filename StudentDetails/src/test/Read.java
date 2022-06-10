package test;
import java.util.Scanner;
public class Read {
public void read(Scanner s,Student stu) {
	System.out.println("Enter the StuName:");
	stu.stuName=s.nextLine();
	System.out.println("Enter the StuBranch:");
	stu.stuBranch=s.nextLine().toUpperCase();
	CheckBranch cb = new CheckBranch();
	boolean k = cb.verify(stu.stuBranch);
	if(k)
	{
		System.out.println("Enter the StuRollNo");
		stu.stuRollNo=s.nextLine();
		if(stu.stuRollNo.length()==10)
		{
			System.out.println("Enter the HNo:");
			stu.sa.hNo=s.nextLine();
			System.out.println("Enter the SName:");
			stu.sa.sName=s.nextLine();
			System.out.println("Enter the City:");
			stu.sa.city=s.nextLine();
			System.out.println("Enter the PinCode:");
			stu.sa.pinCode=Integer.parseInt(s.nextLine());
			System.out.println("Enter the PhoneNo:");
			stu.sc.phoneNo=Long.parseLong(s.nextLine());
			System.out.println("Enter the MailId:");
			stu.sc.mailId=s.nextLine();
			System.out.println("====Enter 6 SubMarks====");
			int totMarks =0,p=0,i=1;
			while(i<=6) {
				System.out.println("Enter the Marks of sub:"+i);
				int sub = Integer.parseInt(s.nextLine());
				i++;
				if (sub<0||sub>100)
				{
					System.out.println("Invalid marks....");
				i--;
				continue;
				}
				if(sub>=0&&sub>=34)
				{
					p=1;
				}
				totMarks= totMarks+sub;
				}
			stu.sr.calculate(p, totMarks);
		}else {
			System.out.println("Invalid rollno.....");
			System.exit(0);
		}
	}else {
		System.out.println("Invalid branch...");
		System.exit(0);
	}
	}
}