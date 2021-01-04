import java.util.*;
class Detail //superclass
{
    String name, address;
    long telno;
    double rent;
 
    Detail(String n1, String a1, long t1, double r1)
    {
        name = n1;
        address = a1;
        telno = t1;
        rent = r1;
    }
 
    void show()
    {
        System.out.println("Name of customer = "+name);
        System.out.println("Address = "+address);
        System.out.println("Telephone Number = "+telno);
        System.out.println("Monthly Rental = "+rent);
    }
} //end of superclass Detail
 
class Bill extends Detail //subclass
{
    int n;
    double amt;
 
    Bill(String n1, String a1, long t1, double r1, int c)
    {
        super(n1,a1,t1,r1); //initializing data members of superclass by calling its constructor
        n = c;
        amt = 0.0;
    }
 
    void cal()
    {
        if(n>=1 && n<=100)
            amt = rent;
        else if(n>=101 && n<=200)
            amt = 0.6*n + rent;
        else if(n>=201 && n<=300)
            amt = 0.8*n + rent;
        else
            amt = 1*n + rent;
    }
 
    void show()
    {
        super.show(); //calling the superclass function show()
        System.out.println("No. of calls = "+n);
        System.out.println("Amount to be paid = Rs. "+amt);
    }
} //end of subclass Bill
 
public class Inheritance2 //Class which will contain the main() method and execute the program
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String n1 = sc.nextLine();
        System.out.print("Enter the address : ");
        String a1 = sc.nextLine();
        System.out.print("Enter the telephone number : ");
        long t1 = sc.nextLong();
        System.out.print("Enter the monthly rental : ");
        double r1 = sc.nextDouble();
        System.out.print("Enter the number of calls : ");
        int c = sc.nextInt();
 
        Bill ob = new Bill(n1,a1,t1,r1,c); //creating object of subclass
        System.out.println("*** Output ***");
        ob.cal();
        ob.show(); //calling show() function of subclass
    }
}