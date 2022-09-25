class P16
{
   public static void main(String args[])
   { 
      for(int i=1;i<=5;i++)
        {
		int c = 4;	
		 for(int j=1;j<=i;j++)
          {
		    System.out.print((j+c)+" ");
			c-=2;
		  }		 
		  System.out.println();
		}	  
   }
}