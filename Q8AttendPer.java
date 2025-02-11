class Q8AttendPer.java
{
int ch,ca,ap;  //ch classes held, ca classes attended, ap attendance percentage.
String cm;     //cm comment.
void input()
{

System.out.println("Enter the no. of classes Held:");
ch=new java.util.Scanner(System.in).nextInt();
System.out.println("Enter the no. of classes Attended:");
ca=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	ap=(ca*100)/ch;
	if (ap>75)
	{
		cm="Allowed";
	}
	else
	{
		cm="Not Allowed";
	}
}
void display()
{
	System.out.println("Percentage of Class Attended is: "+ap+"%");
	System.out.println("Student is "+cm+" for the exam");
}
public static void main(String []args)
{
	Q8AttendPer.java e1=new Q8AttendPer.java();
	e1.input();
	e1.compute();
	e1.display();
}
}