class Stack
{
    int ST[]; // Array to implement stack
    int size; // Maximum size of the stack
    int top; // Index of topmost element (Stack Pointer)
     
    Stack() // Default constructor
    {
        size = 0;
        top = 0;
    }
     
    Stack(int cap) // Parameterised Constructor
    {
        size = cap;
        ST = new int[size];
        top = -1; // Initialising top with -1
    }
     
    void push(int n) // Function to insert element in Stack
    {
        if(top == size-1) // Condition for Overflow
        {
            System.out.println("OVERFLOW");
        }
        else
        {
            top = top + 1;
            ST[top] = n; // Storing value in Stack
        }        
    }
     
    int pop() // Function to delete element from Stack
    {
        if(top == -1) // Condition for Underflow
        {
            System.out.println("UNDERFLOW");
            return -999;
        }
        else
        {
            int val = ST[top]; // Storing the element which will be removed
            top = top - 1;
            return val;
        }
    }
     
    void display()
    {
        if(top == -1)
        {
            System.out.println("The stack is empty");
        }
        else
        {
            System.out.println("The elements in the stack are : ");
            for(int i = top; i>=0; i--)
            {
                System.out.println(ST[i]);
            }
        }
    }
}