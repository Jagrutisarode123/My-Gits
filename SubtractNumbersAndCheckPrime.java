package Jagruti;

import java.util.Scanner;
public class SubtractNumbersAndCheckPrime {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Hello! Subtraction 2 float numbers");
			System.out.println("\n Enter first no :- ");
			float no1 = sc.nextFloat();
			System.out.println("\n Enter second no:- ");
			float no2 = sc.nextFloat();
			System.out.println("addition is "+no1+"-"+no2+" = "+ (no1-no2));
			
	       int i,m=0,flag=0;      
	       int num = 0;
	       System.out.println("Enter the number ");
	       num=sc.nextInt();
	       m=num/2; 
	       if(num==0||num==1){  
	    	   System.out.println(num+" is not prime number");      
	    	  }else{  
	    	   for(i=2;i<=m;i++){      
	    	    if(num%i==0){      
	    	     System.out.println(num+" is not prime number");      
	    	     flag=1;      
	    	     break;      
	    	    }      
	    	   }      
	    	   if(flag==0)  { System.out.println(num+" is prime number"); }  
	    	  }
			
			
			
		}

	
}
