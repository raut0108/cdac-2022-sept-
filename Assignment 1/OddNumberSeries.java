import java.util.*;
class OddNumberSeries
{
   public static void main(String args[])
   {
       System.out.print("Enter the final limit of odd number series : ");
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   System.out.println("The odd number series upto the limit "+num+" :- ");
	   for(int i=1; i<=num; i+=2)
	   { 
	     System.out.print(i+" ");
	   
	   }
	   return;
   }
}