class Q5GradeSys
{
int marks;
char c;
void input()
{
	
System.out.println("Enter the Marks:");
marks=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if(marks<25)
	{
		c='F';
	}
	else if(marks>=25&&marks<=45)
	{
		c='E';
	}
	else if(marks>=45&&marks<=50)
	{
		c='D';
	}
	else if(marks>=50&&marks<=60)
	{
		c='C';
	}
	else if(marks>=60&&marks<=80)
	{
		c='B';
	}
	else if(marks>80)
	{
		c='A';
	}
}
void display()
{
	System.out.println("You got "+c+" Grade");
}
public static void main(String []args)
{
	Q5GradeSys e1=new Q5GradeSys();
	e1.input();
	e1.compute();
	e1.display();
}
}