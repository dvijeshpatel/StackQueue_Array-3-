
public class Queue
{
private int front;
private int rear;
int flagPreviousOperation;
int size;
private int []queue =new  int[5];
Queue()
{
	front=0;
	rear=0;
	size=0;
	this.flagPreviousOperation=-1;
}
public void enqueue(int data) {
	
	if(front==rear&&this.flagPreviousOperation==0)
	{
		System.out.println("Queue is Full");
	}
	else
	{
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
		this.flagPreviousOperation=0;
	}
  
}
public int dequeue(){
	if(front==rear&&(this.flagPreviousOperation==1||this.flagPreviousOperation==-1))
	{
		System.out.println("Queue is Empty");
		return 0;
	}
		else
	{
		int x = queue[front];
		front=(front+1)%5;
		size--;
		this.flagPreviousOperation=1;
		return x;
	}
}
public void printElements()
{
	if(this.flagPreviousOperation==-1)
	{
		System.out.println(" ");
		return;
	}
	int i,j;
	for(i=front,j=0;j<size;j++,i=(i+1)%5)
		System.out.print(queue[i]+" ");
	System.out.println(" ");
	
}
public void search(int key) {
    if (this.empty())
    	{
    	System.out.println("Stack is Empty");
    //	return 0;
    	};
    for (int i = front; i < rear; i++)
        if (queue[i] == key) System.out.println(i+1) ;
}
public boolean empty()
{
	if(front>rear)
		return true;
	return false;
}
}
