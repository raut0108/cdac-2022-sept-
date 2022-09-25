 
 import java.util.*;
 class SmallestNumber {
 
    public static void main(String[] args) {
        //three numbers
         System.out.println("Enter the first number : ");
         Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 System.out.println("Enter the second number : ");
         int b = sc.nextInt();
		 System.out.println("Enter the third number : "); 
		 int c = sc.nextInt();
		 int smallest;
         
        //find the smallest
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
         
        System.out.println(smallest + " is the smallest number.");
    }
}
