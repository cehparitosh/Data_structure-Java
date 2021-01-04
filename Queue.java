import java.util.*;
class Queue
{
    int que[],size,front,rear;
    Queue(int cap)
    {
        size=cap;
        front=0;
        rear=0;
        que=new int[size];
    }
 
    void added(int v)
    {
        if(rear==size-1)
        {
            System.out.print("Queue OVERFLOW");
        }
        else
        {
            if(front==0 && rear==0)
            {
                front=1;
                rear=1;
            }
            else
            {
                rear=rear+1;
            }
            que[rear]=v;
        }
    }
 
    int poprear()
    {
        int value=-9999;
        if(front==0&&rear==0)
        {
            System.out.print("Queue UNDERFLOW");
            return value;
        }
        else
        {
            if(front==rear)
            {
                front=0;
                rear=0;
            }
            else
            {
                front=front+1;
            }
            return value;
        }
    }
 
    void display()
    {
        if(front==0&&rear==0)
        {
            System.out.print("Queue is Empty");
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(que[i]+"\t");
            }
        }
    }
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print ("Enter the size of Queue : ");
        int cap=sc.nextInt();
        Queue ob=new Queue(cap);
        System.out.println("1 for add");
        System.out.println("2 for remove");
        System.out.println("3 for display");
        System.out.println("4 for exit");
        System.out.println("enter a choice");
        int ch=sc.nextInt();
        if (ch==1)
        {
            System.out.print("Enter a number : ");
            int v=sc.nextInt();
            ob.added(v);
        }
        else if (ch==2)
        {
            System.out.print("Value popped = ");
            ob.poprear();
        }
        else if(ch==3)
        {
            ob.display();
        }
        else
            System.out.print("bye");
    }
}