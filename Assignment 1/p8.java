class p8{

public static void main(String args[]){
	
	for(int i=1;i<=5;i++)//rows
	{
		for(int j=1;j<=i;j++)//col
		{
			System.out.print(j+" ");
			
		}
		for(int j=i-1;j>=1;j--)//col
		{
			System.out.print(j+" ");
			
		}
		System.out.println();
	}
	
	
} 
}