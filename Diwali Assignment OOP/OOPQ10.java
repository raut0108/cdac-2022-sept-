package src;
class Demo
{
	
	int a;
	Demo()
	{
		
	}
	Demo(int a)
	{
		this.a=a;
	}
}
class OOPQ10
{
	
	public static void main(String args[])
	{
		Demo d1=new Demo(10);
		Demo d2=new Demo(20);
		Demo temp=d1;
		d1=d2;
		d2=temp;
		System.out.println("Value of a using d1 object : "+d1.a);
		System.out.println("Value of a using d2 object : "+d2.a);
		
		
	}
	
}
