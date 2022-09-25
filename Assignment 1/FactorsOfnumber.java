import java.util.*;
class FactorsOfnumber
{
  public static void main(String args[])
  {
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i =1;
	for(;i<=num;i++)
	{
	  if(num%i == 0)
	  {
	    System.out.println("Factor = "+i);
	  }
	  
	}
	return;
  }
}