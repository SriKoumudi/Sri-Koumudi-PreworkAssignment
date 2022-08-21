	import java.util.Scanner;

	 

	public class PreworkAssignment {	
	//System.out.println("Enter number for checking");
	Scanner sc = new Scanner(System.in);
	
	int n=sc.nextInt();

	 

	           //function to checkPalindrome

	       public void checkPalindrome()  {
	    	   int r,sum=0,t;    
	    	  
	    	   
	    	   t=n;    
	    	   while(n>0){    
	    	    r=n%10;  //getting remainder  
	    	    sum=(sum*10)+r;    
	    	    n=n/10;    
	    	   }    
	    	   if(t==sum)    
	    	    System.out.println("palindrome number ");    
	    	   else    
	    	    System.out.println("not palindrome");    
	    	 }  
	    	 
	    	


	      

	 

	            //function to printPattern

	       public void printPattern() {
	    	   int p,q;
	    	   for(p=n-1;p>=0;p--)
	    	   {
	    		   for(q=0;q<=p;q++)
	    		   {
	    			   System.out.println("*");
	    		   }
	    		   System.out.println();
	    	   }
	       

	      }

	 

	          //function to check no is prime or not

	        public void checkPrimeNumber() {
	        
	if(n%2!=0)
	{
		System.out.println("The given number is prime");
	}

	        }

	         

	          // function to print Fibonacci Series

	          public void printFibonacciSeries() {

	                //initialize the first and second value as 0,1 respectively.

	           int first = 0, second = 1;
	           int cnt=n;
	             
	           System.out.print(first+" "+second);//printing 0 and 1    
	              
	           for(first=2;first<cnt;++first)//loop starts from 2 because 0 and 1 are already printed    
	           {    
	          int  third=first+second;    
	            System.out.print(" "+third);    
	            first=second;    
	            second=third;    
	           }    
	            

	          }
	

	//main method which contains switch and do while loop

	      public static void main(String[] args) {

	    	  PreworkAssignment   obj = new PreworkAssignment();

	                int choice;

	                Scanner sc = new Scanner(System.in);

	do {

	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();

	 

	choice = sc.nextInt();

	switch (choice) {

	 

	case 0:

	choice = 0;

	break;

	 

	case 1: {

	obj.checkPalindrome();

	}

	break;

	 

	case 2: {

	 

	obj.printPattern();

	}

	break;

	 

	case 3: {

	obj.checkPrimeNumber();

	}

	break;

	 

	case 4: {

	 

	obj.printFibonacciSeries();

	}

	break;

	 

	default:

	System.out.println("Invalid choice. Enter a valid no.\n");

	}

	 

	} 
	 
	      while (choice != 0);

	System.out.println("Exited Successfully!!!");

	sc.close();

	}

	 

	}
	



