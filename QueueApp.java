import java.util.Scanner;

class Queue {

    private int[] arr;
	private int front,rear;
	
	Queue(int capacity){
		arr = new int[capacity];
		front = 0;
		rear = -1;
	}
	
	boolean isFull()
	{ return rear == arr.length -1;
	}
	
	boolean isEmpty()
	{
	  return front == rear;	
	}
	
	void enQueue(int value)
	{
		if(!isFull())
		{
		rear += 1;
		rear = (rear)%((arr.length) - 1);
		arr[rear] = value;
		System.out.println(value + " enqueued at index "+rear);
		
		}
		else
		{
			System.out.println(value + " couldn't enqueued at index "+rear);
		}
	}
	
	void deQueue()
	{
		
		if(!isEmpty())
		{	
		
			int temp = arr[front];
			System.out.println(temp + " deqeued from index "+ (front));
			front = (front+1)%(arr.length-1);
			
		}
		
		else
		{
			System.out.println("Couldn't deqeued from index" + (front));
		}
	}
}



class QueueApp{
	
public static void main(String []args)
{	
	Scanner input = new Scanner(System.in);
	Queue q = new Queue(5);
	while(true)
	{	
		System.out.println();
		System.out.print("Enter the value to enQueue it: ");
		int value = input.nextInt();
		q.enQueue(value);
	}
}

}
