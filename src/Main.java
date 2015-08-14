
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
	Stack st = new Stack();
	Queue q = new Queue();
	Scanner s = new Scanner(System.in);
	System.out.println("Choices:");
	System.out.println("(1)Stack\n(2)Queue");
	int c = s.nextInt();
	if(c==1)
	{
	System.out.println("(1)push");
	System.out.println("(2)Search");
	System.out.println("(3)pop");
	System.out.println("(4)Print");
	System.out.println("(5)Exit");
	System.out.println("Enter index for choice");
	int choice = s.nextInt();
	while(choice!=5)
	{
	switch(choice)
	{
	case 1:
	{
		System.out.println("Enter element you want to push");
		st.push(s.nextInt());
		break;
	}
	case 2:
	{
		System.out.println("Enter element you want to search");
		st.search(s.nextInt());
		break;
	}
	case 3:
	{
	
		st.pop();;
		break;
	}
	case 4:
	{
		st.printElements();
	}
	default:
	{
		break;
	}
	
	}
	System.out.println("Choices:");
	System.out.println("(1)push");
	System.out.println("(2)Search");
	System.out.println("(3)pop");
	System.out.println("(4)Print");
	System.out.println("(5)Exit");
	System.out.println("Enter index for choice");
	System.out.println("Enter choice index");
	choice = s.nextInt();
	}
	}
	if(c==2)
	{
			System.out.println("(1)Enque");
			System.out.println("(2)Search");
			System.out.println("(3)Dequeue");
			System.out.println("(4)Print");
			System.out.println("(5)Exit");
			System.out.println("Enter index for choice");
			int choice = s.nextInt();
			while(choice!=5)
			{
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter element you want to Enqueue");
				q.enqueue(s.nextInt());
				break;
			}
			case 2:
			{
				System.out.println("Enter element you want to search");
				q.search(s.nextInt());
				break;
			}
			case 3:
			{
				q.dequeue();
				break;
			}
			case 4:
			{
				q.printElements();
			}
			default:
			{
				break;
			}
			
			}
			System.out.println("Choices:");
			System.out.println("(1)Enqueue");
			System.out.println("(2)Search");
			System.out.println("(3)Dequeue");
			System.out.println("(4)Print");
			System.out.println("(5)Exit");
			System.out.println("Enter index for choice");
			System.out.println("Enter choice index");
			choice = s.nextInt();
			}
		
	
	
	
}
}
}
