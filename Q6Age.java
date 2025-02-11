class Q6Age
{
int a,b,c;
String Oldest,Youngest;
void input()
{

System.out.println("Enter the Q6Age of First Person:");
a=new java.util.Scanner(System.in).nextInt();
System.out.println("Enter the Q6Age of Second Person:");
b=new java.util.Scanner(System.in).nextInt();
System.out.println("Enter the Q6Age of Third Person:");
c=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
if(a>b && a>c)
{
	Oldest="First";
}
if(a<b && a<c)
{
	Youngest="First";
}

if(b>a && b>c)
{
	Oldest="Second";
}
if(b<a && b<c)
{
	Youngest="Second";
}

if(c>a && c>b)
{
	Oldest="Third";
}
if(c<a && c<b)
{
	Youngest="Third";
}

}
void display()
{
	System.out.println("Here "+Oldest+" is the Oldest Person And");
	System.out.println(Youngest+" is the Youngest Person");
}
public static void main(String []args)
{
	Q6Age e1=new Q6Age();
	e1.input();
	e1.compute();
	e1.display();
}
}