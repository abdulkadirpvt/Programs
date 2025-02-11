class Q1SquareRec
{
int a,b;
void input()
{
System.out.println("Enter the value of Length And Breadth of Rectangle: ");
a=new java.util.Scanner(System.in).nextInt();
b=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if(a==b)
	{
		System.out.println("It is a Square");
	}
	else
	{
		System.out.println("It is a Rectangle");
	}
}
public static void main(String []args)
{
	Q1SquareRec e1=new Q1SquareRec();
	e1.input();
	e1.compute();
}
}