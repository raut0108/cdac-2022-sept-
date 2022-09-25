import java.util.*;   
class LcmofTwonumber
{
	
	public static int max(int n1,int n2)
   {
     if(n1>n2)
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
	 int result = max(num1,num2);
	 
	 while(true)
	 {
	   if(result%num1==0 && result%num2==0)
	   {
	     break;
	   }
	   result++;
	 }
	 
	 System.out.println("The LCM of the two given numbers is : "+result);
     return;  
  }
};