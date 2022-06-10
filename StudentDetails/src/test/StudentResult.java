package test;
public class StudentResult {
	public int totMarks;
	public float per;
	public String result;
	public void calculate(int p,int totMarks)
	{
		this.totMarks=totMarks;
		per = (float)totMarks/6;
		if (p==1)
		{
		result="Fail";
		}
		else if (per>=70&&per<=100)
		{
			result="Distinction";
		}
		else if (per>=60&&per<70)
		{
			result="FirstClass";
		}  
		else if (per>=50&&per<60)
		{
			result ="SecondClass";
		}
		else if (per>=35&&per<50)
		{
			result="ThirdClass";
		}
	else
		{
			result="Fail";
		}
	}
	public void getStudentResult()
	{
		System.out.println("====StudentResult====");
		System.out.println("TotMarks:"+totMarks);
		System.out.println("Per"+per);
		System.out.println("Result:"+result);
	}
	}

