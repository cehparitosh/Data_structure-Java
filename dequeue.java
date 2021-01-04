import java.io.*;
class dequeue
{
    int arr[]=new int[10];
    int f,r;
    int i,n;
    String str;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    dequeue()
    {
        f=-1;
        r=-1;
    }
    public void push()throws IOException
    {
        if(r==9)
        {
            System.out.println("Queue Overflow");
            return;
        }
        System.out.println("Specify the location(front or rear):");
        str=br.readLine().toLowerCase();
        System.out.println("Enter the value to insert:");
        n=Integer.parseInt(br.readLine());
        if(f==-1)
        {
            arr[++f]=n;
            r=0;
        }
        else if(str.charAt(0)=='f')
        {
            for(i=r+1;i>f;i--)
            arr[i]=arr[i-1];
            arr[i]=n;
            r++;
        }
        else
        {
            arr[++r]=n;
        }
    }
    public void display()
    {
        if(f==-1)
        return;
        for(i=f;i<=r;i++)
        System.out.println(""+arr[i]);
    }
    public void pop()throws IOException
    {
        if(f==-1)
        {
            System.out.println("Queue Overflow");
            return;
        }
        System.out.println("Specify the location(front  or rear):");
        str=br.readLine().toLowerCase();
        if(f==r)
        {
            f=-1;
            r=-1;
        }
        else if(str.charAt(0)=='f')
        {
            f++;
        }
        else
        {
            r--;
        }
    }
    public static void main(String args[])throws IOException
    {
        char op;
        BufferedReader br;
        dequeue ob=new dequeue();
        while(true)
        {
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nPress'P' for Push,'D' for Pop and 'Q' for Quit:");
            op=(char)br.read();
            
            if(op=='p' || op=='P')
            ob.push();
            else if(op=='d' || op=='D')
            ob.pop();
            ob.display();
            if(op=='q' || op=='Q')
            break;
            br=null;
        }
    }
}