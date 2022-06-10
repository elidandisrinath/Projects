package test;
public class Student {
public String stuName,stuBranch,stuRollNo;
public StudentAddress sa = new StudentAddress();
public StudentContact sc = new StudentContact();
public StudentResult sr = new StudentResult();
public void getStudent()
{
System.out.println("====StudentDetails====");
System.out.println("StuName:"+stuName);
System.out.println("StuBranch:"+stuBranch);
System.out.println("StuRollNo:"+stuRollNo);
}
}
