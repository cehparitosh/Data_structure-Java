import java.util.*;    
class factRecursion
{  
        int factorial(int n) //5 ! =5*4*3*2*1 =120 
     {    
      if (n == 0)       // 0!=1 so when given number is 0, it returns 1
        return 1;    
      else          // finding factorial by n * factorial(n-1)
        return(n * factorial(n-1));    
     }    
     public static void main(String args[])
     {  
         Scanner sc=new Scanner(System.in);
         factRecursion fr=new factRecursion();   //creating object fr
         System.out.println("Enter the number to find the factorial");
         int number=sc.nextInt();//It is the number to calculate factorial
         int fact=1;  
         fact = fr.factorial(number);   //method invocation factorial(number)
                                        // calling recursive method
         System.out.println("Factorial of "+number+" is: "+fact);    
     }  
    }