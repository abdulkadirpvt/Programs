class Q3ShopDis
{
int quantity,cost;
float discount,fprice;  //final price.
void input()
{
System.out.println("Enter the Total Qauntity");
quantity=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	cost=quantity*100;
	if(cost>1000)
	{
		System.out.println("You Are Eligible for 10% Discount");
		discount=(float)(10*cost)/100;
		fprice=(float)cost+discount;
	}
	else
	{
		fprice=(float)quantity*100;
	}
}
void display()
{
System.out.println("Total Cost Will be= "+fprice);	
}
public static void main(String []args)
{
	Q3ShopDis e1=new Q3ShopDis();
	e1.input();
	e1.compute();
	e1.display();
}
}