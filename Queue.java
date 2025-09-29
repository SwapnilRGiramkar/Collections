//This is the Interface of Queue
package collections;

public interface Queue<E>
{
	int initialCap=16;
	
	boolean add(E ele);
	
	E element();
	
	boolean offer(E ele);
	
	E peek();
	
	E poll();
	
	E remove();
	
	int size();
	
	boolean isEmpty();
	
	boolean equals(Object o);
	
	String toString();
	
}

