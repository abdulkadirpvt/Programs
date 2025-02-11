class Q11CaseCheck
{
	char n;
	String cm;
	
	void input()
	{
		
		System.out.println("Enter the Charecter to check it: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	
	void compute()
	{
		if(n>=65 && n<=90)
		{
			cm="Upper Case";
		}
		else if(n>=97 && n<=122)
		{
			cm="Lower Case";
		}
		else
		{
			cm="Invalid Character";
		}
	}
	
	void display()
	{
		System.out.println("It is "+cm);
	}
	public static void main(String []args)
	{
		Q11CaseCheck e1=new Q11CaseCheck();
		e1.input();
		e1.compute();
		e1.display();
	}
}