class Q12LeapYear
{
int y;
String cm;

void input()
{

	System.out.println("Enter the Year to check in YYYY formate");
	y=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if((y%4==0) && (y%100!=0 || y%400==0))
	{
		cm="Leap Year";
	}
	else
	{
		cm="not Leap Year";
	}
}
void display()
{
	System.out.println("It is "+cm);
}
public static void main(String []args)
{
	Q12LeapYear e1=new Q12LeapYear();
	e1.input();
	e1.compute();
	e1.display();
}
}