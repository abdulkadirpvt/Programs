class Q4SalarayBonus
{
int salary,year;
float famount,bonus;   // famount final Amount.
void input()
{

	System.out.println("Enter the Salary amount:");
	salary=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the year of Service:");
	year=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if(year>5)
	{
		bonus=(float)(salary*5)/100;
		famount=salary+bonus;
		System.out.println("You are eligible for bonus");
	}
	else
	{
		famount=salary;
	}
}
void display()
{
	System.out.println("The Amount will be: "+famount);
}
public static void main(String []args)
{
	Q4SalarayBonus e1=new Q4SalarayBonus();
	e1.input();
	e1.compute();
	e1.display();
}
}