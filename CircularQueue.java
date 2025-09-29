//This was the Example of Circular Queue
package collections;

public class CircularQueue <E> implements Queue<E>
{
	private Object []ar;
	private int front,rear,count,initCap;
	
	public CircularQueue(int initCap)
	{
		this.initCap=initCap;
		ar=new Object[initCap];
		front=0;
		rear =-1;
		count=0;
	}

	@Override
	public boolean add(E ele) {
		if(count==initCap)
		{
			throw new ArrayIndexOutOfBoundsException("Element is Not accessing check the capacity");
		}
		rear=(rear+1)%initCap;
		ar[rear]=ele;
		count++;
		return true;
	}

	
	public boolean offer(E ele) {
		if(count==initCap) return false;
		return add(ele);
	}

	@Override
	public E peek() {
		if(count==0) return null;
		return (E) ar[front];
	}

	@Override
	public E poll() 
	{
		return remove();
	}

	public E remove()
	{
		if(count==0) return null;
		E ele = (E) ar[front];
        front = (front + 1) % initCap;
        count--;
        return ele;
	}
	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}
	public String toString()
	{
		StringBuilder ans = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % initCap;
            ans.append(ar[index]);
            if (i < count - 1) ans.append(", ");
        }
        ans.append("]");
        return ans.toString();
	}

	@Override
	public E element() {
		 if (count == 0) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return (E) ar[front];
	}

	
}

