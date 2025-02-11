class MoBike
{
String bno,cname;
int days;
int charge=0;
void input()
{
    
	System.out.println("Enter the Bike Number: ");
    bno=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the Customer Name: ");
	cname=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the No. Of days: ");
	days=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	if(days<=5)
	{
		charge=500*days;
	}
	else if(days<=10&&days>5)
	{
		charge=2500+400*(days-5);
	}
	else
	{
		charge=4500+200*(days-10);
	}
}
void display()
{
System.out.println("Bike_No. "+bno+" Customer_Name "+cname+" No._of_Days "+days+" Charge "+charge);
}
public static void main(String []args)
{
	MoBike e1=new MoBike();
	e1.input();
	e1.compute();
	e1.display();
}
}