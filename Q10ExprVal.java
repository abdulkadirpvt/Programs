class Q10ExprVal
{
int x=2,y=5,z=0;
String cm1,cm2,cm3,cm4,cm5,cm6;

void compute()
{
if(x==2)
{
    cm1="True";
}
else
{
    cm1="false";	
}
if(x!=5)
{
	cm2="True";
}
else
{
    cm2="false";	
}
if(x!=5 && y>=5)
{
    cm3="True";
}
else
{
    cm3="false";	
}
if(z!=0 || x==2)
{
    cm4="True";
}
else
{
    cm4="false";	
}
if(!(y<10))
{
	cm5="True";
}
else
{
	cm5="False";
}
}
void display()
{
	System.out.println(cm1+"\n"+cm2+"\n"+cm3+"\n"+cm4+"\n"+cm5);
}
public static void main(String []args)
{
	Q10ExprVal e1=new Q10ExprVal();
	e1.compute();
	e1.display();
}
}