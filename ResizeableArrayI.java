//Resizeable Array Interface
package collections;

public interface ResizeableArray<E> 
{
	int initCap=10;
	double loadFactor=0.75;
	boolean add(E o);
	boolean addIndex(int index,E o);
	boolean addAll(E ar);
	boolean remove(E o);
	boolean removeIndex(int index);
	boolean removeIndexOb(int index,E o);
	boolean removeAll();
	boolean removeFrom(int index);
	int size();
	void clear();
	boolean isEmpty();
	boolean equals(Object o);
	E get(int index);
	String toString();
}

