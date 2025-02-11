class Q2Greatest
{
int a,b;
void input()
{

System.out.println("Enter any two number: ");
a=new java.util.Scanner(System.in).nextInt();
b=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if(a>b)
	{
		System.out.println(a+" is Greatest");
	}
	else
	{
		System.out.println(b+" is Greatest");
	}
}
public static void main(String []args)
{
	Q2Greatest e1=new Q2Greatest();
	e1.input();
	e1.compute();
}
}