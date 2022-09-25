import java.util.*;
class Factorial
{
   public static int fact(int n)
   {
     if(n==0)
	 return 1;
	 else
	 return n*fact(n-1);
	 
   }
   
   public static void main(String args[])
   {
      int facto=0;
      System.out.print("Enter the number : ");
      Scanner s = new Scanner(System.in);
	  int n = s.nextInt();
	  if(n==0)
	  System.out.println("Factorial = 1 .");
	  else
	  {
	   facto = fact(n);
	   System.out.println("Factorial = "+facto +".");
	  }
   }
}