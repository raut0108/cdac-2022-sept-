import java.util.*;
class Swap
{
   public static void main(String args[])
   {
      
     System.out.print("Enter two numbers for swapping : ");
	 Scanner sc = new Scanner(System.in);
	 int num1 = sc.nextInt();
	 int num2 = sc.nextInt();
	 
	 
	 System.out.println("Before swapping : num1 = "+num1 +" and num2 = "+num2+"\n");
	 num1 = num1+num2;     //10+15 = 25
	 num2 = num1 - num2;  //25-15 = 10 
	 num1 = num1 - num2;  //25-10 = 15
	 System.out.print("After swapping : num1 = "+num1 +" and num2 = "+num2);
	 
   }
}