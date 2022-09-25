import java.util.*;
class PalindromeNumber
{
   public static void main(String args[])
   {  
      System.out.print("Enter the number : ");
	  Scanner sc =new Scanner(System.in);
	  int num = sc.nextInt();
	  
	  int temp=num;
	  int sum = 0;
	  while(num>0)
	  {
	    int rem = num%10;
		sum = sum*10 + rem;
		num = num / 10;
	  }
      if(sum == temp)	  
	  System.out.println("The number "+temp+" is palindrome" );
	  else
	  System.out.println("The number "+temp+" is not palindrome" );
	  return;
   }
}