package maccess;
import test.Student;
import test.Read;
import test.Display;
import java.util.Scanner;
public class StuMainClass {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Student stu = new Student();
	Read r = new Read();
	r.read(s, stu);
	Display d = new Display();
	d.dis(stu);
	s.close();
	}
}
