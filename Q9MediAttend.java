class Q9MediAttend
{
	String cm,md;   //cm comment
	int ca,ch,ap;   //ca class attended, ch class held, ap attendance percentage.

void input()
{
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the no. of Classes held: ");
   ch=new java.util.Scanner(System.in).nextInt();
   System.out.print("Enter the no. of classes attended: ");
   ca=new java.util.Scanner(System.in).nextInt();
   System.out.print("Press y if Medical is Available else Press n: ");
   md=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
	ap=(ca*100)/ch;
	if(ap>75 || md.equals("y"))
	{
		cm="Allowed";
	}
	else
	{
		cm="Not Allowed";
	}
}
void display()
{
	System.out.println("Percentage of class attended is: "+ap+"%");
	System.out.println("Student is "+cm+" for the Exam");

}
public static void main(String []args)
{
	Q9MediAttend e1=new Q9MediAttend();
	e1.input();
	e1.compute();
	e1.display();
}
}