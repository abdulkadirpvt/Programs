class Q7AbsoluteV
{
int i,o;
void input()
{

System.out.println("Enter The Number To Find its Absolute Value:");
i=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	//o=Math.abs(i);
	if(i<0)
	{
		o=i*-1;
	}
	else
	{
		o=i;
	}
}
void display()
{
	System.out.println("Absolute value is :"+o);
}
public static void main(String []args)
{
	Q7AbsoluteV e1=new Q7AbsoluteV();
	e1.input();
	e1.compute();
	e1.display();
}
}