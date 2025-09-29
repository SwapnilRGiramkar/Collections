//In this we Implemented the Queue Interface in java 
package collections;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E>
{
	Object []ar;
	int cap=Queue.initialCap;
	int ct=0;
	
	public ArrayQueue()
	{
		ar=new Object[Queue.initialCap];
	}
	
	ArrayQueue(int cap) throws WrongInitialCapacity
	{
		if(cap>=0)
		{
			this.cap=cap;
			ar=new Object[cap];
		}
		else
		{
			throw new WrongInitialCapacity("A Queue Cannot be negative size ");
		}
	}
	ArrayQueue(Queue<E> ref)
	{
		
	}
	
	@Override
	public boolean add(E ele) {
		if(ele!=null)
		{
			if(ct<ar.length*0.75)
			{
				ar[ct]=ele;
				ct++;
				return true;
			}
			else
			{
				Object[] temp=new Object[ar.length*2];
				
				for(int i=0;i<ct;i++)
				{
					temp[i]=ar[i];
					
				}
				ar=temp;
				ar[ct]=ele;
				ct++;
				return false;
			}
		}
		return false;
	}

	@Override
	public E element() {
		if(ar[0]!=null)
		{
			return(E)ar[0];
		}
		throw new NoSuchElementException("No element if First");
	}

	@Override
	public boolean offer(E ele) {
		return add(ele);
	}

	@Override
	public E peek() {
		return element();
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return remove();
	}

	@Override
	public E remove() {
		E val=(E)ar[0];
		if(val!=null)
		{
			for(int i=1;i<ct;i++)
			{
				ar[i-1]=ar[i];
			}
			ct--;
			return val;
		}
		return val;
	}

	@Override
	public int size() {
		return ct;
	}

	@Override
	public boolean isEmpty() {
		return ct==0;
	}
	public boolean equals(Object obj)
	{
		ArrayQueue<E> ref =(ArrayQueue<E>) obj;
		for(int i=0;i< ct;i++)
		{
			if(this.ar[i]!=ref.ar[i])
			{
				return false;
			}
		}
		return true;
	}
	public String toString()
	{
		String ans="[";
		for(int i=0;i<ct;i++)
		{
			 if(i<ct-1)
			 {
				 ans =ans+ar[i]+", ";
			 }
			 else
			 {
				 ans =ans+ar[i];
			 }
		}
		ans=ans+"]";
		return ans;
	}

}

