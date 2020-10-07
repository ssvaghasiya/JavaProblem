
class Queue{
	
	int cap,size,front;
	int arr[];
	
	Queue(int c)
	{
		cap = c;
		size = 0;
		front = 0;
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
		front++;
	}
	
	int getFront()
	{
		if(isEmpty())
			return -1;
		else
			return front;
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

	public static void main(String args[])
	{
			Queue q = new Queue(5);
			q.enqueue(5);
			q.enqueue(10);
			q.enqueue(15);
			q.enqueue(20);
			System.out.println(q.getFront());
			System.out.println(q.getRear());
			q.dequeue();
			System.out.println(q.getFront());
			q.dequeue();
					System.out.println(q.getFront());
	}
}
			