import java.util.*;
class GcdofTwonumber
{
   public static int min(int n1,int n2)
   {
     if(n1<n2)
	 return n1;
	 else
	 return n2;
   }

   public static void main(String args[])
   {
      System.out.println("Enter two numbers : ");
	  Scanner sc = new Scanner(System.in);
	  int num1 = sc.nextInt();
	  int num2 = sc.nextInt();
	  
	  int result =min(num1,num2); 
	  while(result>0)
	  {
	     if(num1% result == 0  && num2 % result == 0)
		 {
		    break;
		 }
	     result--;
	  }
	  
	  System.out.println("The GCD of the given numbers is : "+result);
	  
    return ; 
   }
}