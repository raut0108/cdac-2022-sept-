import java.util.*;
class PrimeFactors
{
   public static void main(String args[])
   {
     System.out.print("Enter the number : ");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int i =2;
	 System.out.print("Prime factors of "+num+" are :- ");
	 while(num>1)
	 {
	   if(num%i == 0)
	   {
	     System.out.print(i+" ");
		 num=num/i;
	   }
	   else
		   i++;
	  
	 }
	 
	 return;
   }
}