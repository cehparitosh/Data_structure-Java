import java.util.*;
class fibo
{  
int fib(int n) 
{ 
    int a=0,b=1;
if (n <= 1) 
   return a;
   else if(n==2)
   return b; 
   else
return fib(n-1) + fib(n-2); 
} 
void genSeries()
{   Scanner sc=new Scanner(System.in);
    int n ,c; 
    System.out.println("Enter the limit:");
    n=sc.nextInt();
    System.out.println("The Fibonacci series is:");
    for(int i=1;i<=n;i++)
    {
        c=fib(i);
        System.out.print(c +" ");
    }
}

public static void main (String args[]) 
{ 
    fibo f=new fibo();

  f.genSeries();
} 
}