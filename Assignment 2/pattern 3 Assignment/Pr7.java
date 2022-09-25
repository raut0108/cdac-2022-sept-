class Pr7
{
  public static void main(String args[])
  {
    for(int i=1;i<=9;i++)
	{
	   for(int j=1;j<=i;j++)
	   {
	    System.out.print("  ");
	   }
	   int c=10-i;
	   for(int j=1;j<=10-i;j++)
	   {
	    System.out.print(c+"   ");
	   }
	   
	   System.out.println();
	   
	}
  }
}