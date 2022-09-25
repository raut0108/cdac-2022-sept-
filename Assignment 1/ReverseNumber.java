import java.util.*;
class ReverseNumber
{
   public static void main(String args[])
   {  
      System.out.print("Enter the number : ");
	  Scanner sc =new Scanner(System.in);
	  int num = sc.nextInt();
	  int Rev_no = 0;
	  while(num>0)
	  {
	    int rem = num%10;
		Rev_no = Rev_no*10 + rem;
		num = num / 10;
	  }
	  
	  System.out.println("The Reverse  number is : "+Rev_no);
	  return;
   }
}