/*Create an interface with name ‘LinearDS’ with the following member and methods:
i) MAXSIZE – indicate the maximum capacity of the data structure
ii) add(element) - the method to add an element to the datastructure (as per its rule)
iii) remove() - the method to remove an element from the data structure (as per its rule)
iv) displayElement() - the method to display all the element of the data structure.
Implement your interface to define two classes MyStack and MyQueue to implement all
operations of a stack and queue using LinearDS respectivley. */

import java.util.*;

interface LinearDS 
{
    public void MAXSIZE();
    public void add(int value);
    public void remove();
    public void displayElement();
}
class MyStack implements LinearDS
{
    public int MAXSIZE=100;
    int sta[]=new int[100];
    int top=-1;
    public void MAXSIZE()
    {
        System.out.println("maximum size of stack =" + MAXSIZE);
    }
    public void add(int item)
    {
          if(top==sta.length-1)
          {
               System.out.println("Stack Overflows");
               int t[]=new int[sta.length*2];
               for(int i=0;i<sta.length;i++)
                    t[i]=sta[i];
               sta=t;
               sta[++top]=item;
          }
          else
               sta[++top]=item;
    }
    public void remove()
    {
          if(top<0)
          {
               System.out.println("Stack Underflows");
               return;
          }
          else
               top--;
    }
    public void displayElement() 
    {
          for(int i = 0; i <= top; i++) 
          {
               System.out.print(sta[i] + ", ");
          }
    }
}
class MyQueue implements LinearDS
{
     public int MAXSIZE=100;
     int que[]=new int[100];
     int front=0,rear=0;  
     public void MAXSIZE()
     {
          System.out.println("maximum size of queue =" + MAXSIZE);
     }
     public void add(int item)  
     {   
          if (MAXSIZE == rear) 
          {   
               System.out.printf("\nQueue is full\n");   
               return;   
          }      
          else 
          {   
               que[rear] = item;   
               rear++;   
          }   
          return;   
     }   
     public void remove()  
     {   
          if (front == rear) 
          {   
               System.out.printf("\nQueue is empty\n");   
               return;   
          }   
          else 
          {   
               for (int i = 0; i < rear - 1; i++) 
               {   
                    que[i]=que[i+1];   
               }   
               if (rear < MAXSIZE)   
                    que[rear] = 0;     
               rear--;   
          }   
          return;   
     }      
     public void displayElement()   
     {   
          int i;   
          if (front == rear) 
          {   
               System.out.printf("Queue is Empty\n");   
               return;   
          }    
          for (i = front; i < rear; i++) 
          {   
               System.out.printf(" %d , ", que[i]);   
          }   
          return;   
     }  
}
public class Problem3
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          MyStack stk=new MyStack();
          MyQueue que=new MyQueue();
          int ch=0;
          do
          {
               System.out.println("1.add element in stack,2.remove element from stack, 3.DisplayrElements of stack,4.maxsize of stack ,5.add element in queue,6.remove element in queue , 7.DisplayrElements of queue,8.maxsize of queue ,press any key other than 1-8 to exit");
               System.out.println("Enter your choice:");
               
               ch=sc.nextInt();
               switch(ch)
               {
                    case 1:
                         System.out.println("Enter the element to insert in stack:");
                         int x=sc.nextInt();
                         stk.add(x);
                         break;
                    case 2:
                         stk.remove();
                         break;
                    case 3:
                         stk.displayElement();
                         break;
                    case 4:
                         stk.MAXSIZE();
                         break;
                    case 5:
                         System.out.println("Enter the element to insert in queue:");
                         int y=sc.nextInt();
                         que.add(y);
                         break;
                    case 6:
                         que.remove();
                         break;
                    case 7:
                         que.displayElement();
                         break;
                    case 8:
                         que.MAXSIZE();
                         break;
                    default:
                         System.exit(0);
               }
          }
          while(ch<9);
     }
}
