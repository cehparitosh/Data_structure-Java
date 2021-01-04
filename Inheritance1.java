import java.util.*;
class Record //superclass
{
    String name[];
    int rnk[];
 
    Record()
    {
        name = new String[5];
        rnk = new int[5];
    }
 
    void readvalues()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Inputting The Names And Ranks ***");
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter name of student "+(i+1)+" : ");
            name[i] = sc.nextLine();
            System.out.print("Enter his rank : ");
            rnk[i] = sc.nextInt();
            sc.nextLine(); //to absorb the extra line (enter key input from above)
        }
    }
 
    void display()
    {
        System.out.println("Name\t\tRank");
        System.out.println("-------\t\t-------");
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]+"\t\t"+rnk[i]);
        }
    }
} //end of superclass Record
 
class Rank extends Record //subclass
{
    int index;
 
    Rank()
    {
        super(); //invoking the constructor of superclass
        index = 0;
    }
 
    void highest()
    {
        int max = rnk[0];
        for(int i=0;i<5;i++)
        {
            if(rnk[i]>max)
            {
                index = i;
            }
        }
    }
 
    void display()
    {
        super.display(); //calling the superclass function display()
        System.out.println("\nTop most rank = "+rnk[index]);
        System.out.println("Student with topmost rank = "+name[index]);
    }
} //end of subclass Rank
 
public class Inheritance1 //Class which will contain the main() method and execute the program
{
    public static void main(String args[])
    {
        Rank ob = new Rank(); //creating object of subclass
        ob.readvalues();
        ob.highest();
        System.out.println("*** Output ***");
        ob.display(); //calling display() function of subclass
    }
}