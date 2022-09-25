import java.util.*;
class LeapYear
{
  public static void main(String args[])
  {
	  char ch = 'n';
      do
	  {
	    System.out.print("Enter the Year : ");
		Scanner sc = new Scanner(System.in);
	    int yr = sc.nextInt();
		
		if(yr % 4 == 0 && yr%100 !=0 || yr%400==0 )
		{ 
		  System.out.println(yr+" is leap year .");
		}
		else
		{
		  System.out.println(yr+" is not leap year .");
		}
		
		System.out.print("Do you want to continue (y/n): ");
		ch = sc.next().charAt(0);
	    
	  }while(ch == 'Y' || ch == 'y');
	  
  }
}