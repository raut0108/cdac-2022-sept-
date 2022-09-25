import java.util.*;
class PRintno
{
    public static void printnum(int num)
	{
	if(num == 0)
	 {
	   System.out.println("Number = "+num);
	   return;
	 }
	 else
	 {
	   printnum(num-1);
	   System.out.println("Number = "+num);
        return ;	   
	 }
      	
	}
	
	public static void main(String args[])
	{
		System.out.print("Enter the number : ");
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   printnum(num);
	   return;
	 
	}
	
}