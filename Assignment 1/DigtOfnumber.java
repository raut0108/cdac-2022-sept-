import java.util.*;
class DigtOfnumber
{
   public static void main(String args[])
   {
      System.out.print("How many digits of number u want to enter : ");
	  Scanner sc = new Scanner(System.in);
	  int i = sc.nextInt();
	  System.out.print("Enter the "+i+" digits of number : ");
	  int num = sc.nextInt();
	  int sum = 0;
	  for( ;i>0;i--)
	  {
	    int add = num % 10 ;
		num = num/10;
		sum = sum+add;
	  }
	  System.out.println("Sum of the digits of number : "+sum);
	  return;
	  
   }
}