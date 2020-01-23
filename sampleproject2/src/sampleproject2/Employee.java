package sampleproject2;

public class Employee {
int eid;
String ename;
int age;
float salary;
float annualsal;
public void getDetails()
{
	eid=101;
	ename="sindhu";
	age=22;
	salary=2.0f;
}
public void dispDetails()
{
	System.out.println("name:"+ename);
	System.out.println("annual salary:"+salary);
	
}
public void calculateSalary()
{
	 annualsal=salary*12;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
