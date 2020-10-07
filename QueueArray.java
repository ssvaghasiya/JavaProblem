

class Queue{
	
	int cap,size;
	int arr[];
	
	Queue(int c)
	{
		cap = c;
		size = 0;
		arr = new int[cap];
	}
	
	void enqueue(int x)
	{
		arr[size++] = x;
	}
	
	void dequeue()
	{
		for(int i=0;i<size-1;i++)
		{
			arr[i] = arr[i+1];
		}
		size--;
	}
	
	int getFront()
	{
		if(isEmpty())
			return -1;
		else
			return 0;
	}
	
	int getRear()
	{
		if(isEmpty())
			return -1;
		else
			return size-1;
	}
	
	boolean isEmpty()
	{
		return (size==0);
	}
	
	boolean isFull()
	{
		return (size==cap);
	}
	
	int size()
	{
		return size;
	}
}
public class QueueArray
{
	public static void main(String args[])
	{
			Queue q = new Queue();
			q.enqueue(5);
			q.enqueue(10);
			q.enqueue(15);
			q.enqueue(20);
			System.out.println(q.getFront());
			System.out.println(q.getRear());
	}
}
			