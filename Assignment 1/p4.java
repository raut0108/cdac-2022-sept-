class p4
{
  public static void main(String args[])
  {
    for(int i=1;i<4;i++)
    {
      for(int j=1;j<=4;j++)
       {   
          if((j==i)||(j == (i+1)) || (j == (i+2)))
         System.out.print("  ");
         else
         System.out.print(j+" ");
       } 
      
     System.out.println(); 
    }
      
  }
}