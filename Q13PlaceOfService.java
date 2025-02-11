class Q13PlaceOfService
{
int age;
char sex,ms;
String cm;

void input()
{

	System.out.println("Enter your age: ");
	age=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter m for Male And f for Female: ");
	sex=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the Marital Status(y or n):");
	ms=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if(sex=='f' || (sex=='m' && (age>40 && age<60)))
	{
		cm="will work only in Urban areas";
	}
	else if(sex=='m' && age>20 && age<40)
	{
		cm="may work in Anywhere";
	}
	else
	{
	    System.out.println("ERROR");	
	}
}
void display()
{
	System.out.println("You "+cm);
}
public static void main(String []args)
{
	Q13PlaceOfService e1=new Q13PlaceOfService();
	e1.input();
	e1.compute();
	e1.display();
}
}