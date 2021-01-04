import java.io.*;
class Perimeter //superclass
    {
        double a,b;
        Perimeter(double x, double y)
        {
            a=x;
            b=y;
        }
        double Calculate()
        {
            double p=2*(a+b);
            return p;
        }
        void show()
        {
            System.out.println("Length = "+a);
            System.out.println("Breadth = "+b);
            System.out.println("Perimeter = "+Calculate()); //printing perimeter by calling Calculate()
        }
    } //end of superclass Perimeter
 
class Area extends Perimeter //subclass
    {
        double h, area;
        Area(double x, double y, double z)
        {
            super(x,y); //initializing data members of superclass by calling its constructor
            h=z;
        }
        void doarea()
        {
            area=b*h;
        }
        void show()
        {
            super.show(); //calling the superclass function show()
            System.out.println("Height = "+h);
            System.out.println("Area = "+area);
        }
    } //end of subclass Area
 
/* In your exams you don't need to write the below given code
   We are writing it so as to familiarize the students on how to run
   programs based on the concept of inheritance.*/
 
public class Inheritance3 //Class which will contain the main() method and execute the program
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter The Length : ");
            double x=Double.parseDouble(br.readLine());
            System.out.print("Enter The Breadth : ");
            double y=Double.parseDouble(br.readLine());
            System.out.print("Enter The Height : ");
            double z=Double.parseDouble(br.readLine());
 
            Area ob=new Area(x,y,z); //creating object of subclass
            System.out.println("*** Output ***");
            ob.doarea();
            ob.show(); //calling show() function of subclass
        }
    }