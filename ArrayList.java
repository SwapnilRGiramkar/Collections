//ArrayList which implements the Resizeable Array
package collections;

public class ArrayList<E> implements ResizeableArray<E>
{
	Object []ar;
	int count =0;
	int initCap=ResizeableArray.initCap;
	public ArrayList() 
	{
		ar=new Object [initCap];
	}
	public ArrayList(int initCap)
	{
		this.initCap=initCap;
		ar=new Object [initCap];
	}
	//add
	public boolean add(Object o)
	{
		if(count <ar.length *ResizeableArray.loadFactor)
		{
			ar[count]=o;
			count++;
		}
		else
		{
			Object[]temp=new Object[ar.length*2];
			for(int i=0;i<count+1;i++)
			{
				temp[i]=ar[i];
			}
			ar=temp;
			ar[count]=0;
			count++;
		}
		return true;
	}
	//add with index 
	public boolean addIndex(int index,Object o)
	{
		if(index<=count)
		{
			if(count<ar.length*ResizeableArray.loadFactor)
			{
				rightShift(index);
				ar[index]=o;
				count++;
				return true;
			}
			else
			{
				Object[]temp=new Object[ar.length*2];
				for(int i=0;i<count+1;i++)
				{
					if(i<index)
					{
						temp[i]=ar[i];
					}
					else if(i==index)
					{
						temp[i]=o;
					}
					else
					{
						temp[i]=ar[i-1];
					}
				}
				ar=temp;
				ar[count]=0;
				count++;
				return true;
			}
		}
		throw new ArrayIndexOutOfBoundsException("Cannot be insert the element whenever ");
	}
	//add All
	public boolean addAll(int index,E ar)
	{
		//if(index>=0 && index < count && ar!=null && )
		return false;
	}
	//Remove Object
	public boolean remove(E o)
	{
		int index=indexOf(o);
		if(index!=-1)
		{
			ar[index]=o;
			leftShift(index);
			count--;
			return true;
		}
		throw new ArrayIndexOutOfBoundsException("Entering index are incorrect");
	}
	//Remove Object via Index
	public boolean removeIndex(int index)
	{
		if(index<count )
		{
			leftShift(index);
			count--;
			return true;
		}
		throw new ArrayIndexOutOfBoundsException("Entering index are incorrect");
	}
	//Remove Index and Object
	public boolean removeIndexOb(int index,Object o) 
	{
		if(index<count)
		{
			if(ar[index].equals(o))
			{
				leftShift(index);
				count--;
				return true;
			}
			throw new ArrayIndexOutOfBoundsException("Entering index of Perticular object is incorrect");
		}
		throw new ArrayIndexOutOfBoundsException("Entering index are incorrect");
	}
	//Remove all after the index
	public boolean removeFrom(int index)
	{
		if(index<count && index>=0)
		{
			
			for(int i=index;i<count;i++)
			{
				ar[i]=null;
			}
			count=index;
			return true;
		}
		throw new ArrayIndexOutOfBoundsException("Entering index are incorrect");
	}
	//Remove all 
	public boolean removeAll()
	{
		int index=0;
		if(index<count)
		{
			int i=index;
			for(;i<count;i++)
			{
				leftShift(i);
			}
			count=count-i;
			return true;
		}
		throw new ArrayIndexOutOfBoundsException("Entering index is incorrect");
	}
	//Size of an Array
	public int size()
	{
		return count;
	}
	//clear
	public void clear()
	{
		for(int i=0;i<count;i++)
		{
			ar[i]=null;
		}
		count=0;
	}
	//isEmpty
	public boolean isEmpty()
	{
		return count==0;
	}
	//Shift the element
	public void rightShift(int index)
	{
		if(count<ar.length*ResizeableArray.loadFactor)
		{
			for(int i=count;i>index;i--)
			{
				ar[i]=ar[i-1];
			}
		}
	}
	//shift the element in left
	public void leftShift(int index)
	{
		if(count<ar.length*ResizeableArray.loadFactor)
		{
			for(int i=index;i<count;i++)
			{
				ar[i]=ar[i+1];
			}
		}
	}
	//toString 
	public String toString()
	{
		String op="[";
		for(int i=0;i<count;i++)
		{
			if(i<count-1)
			{
				op=op+ar[i]+",";
			}
			else
			{
				op=op+ar[i];
			}
		}
		return op+"]";
	}
	//equals method
//	public boolean equals(Object o)
//	{
//		if(o==null)
//		{
//			return false;
//		}
//		else if (o.getClass()!=this.getClass())
//		{
//			return false;
//		}
//		else if(this==o)
//		{
//			return true;
//		}
//		else
//		{
//			
//		}
//	}
	//get element through the index 
	public E get(int index)
	{
		if(index>=0 && index< count)
		{
			return (E) ar[index];
		}
		throw new IndexOutOfBoundsException("Cannot find the element out of range");
	}
	//index Of
	public int indexOf(E o)
	{
		for(int i=0;i<count;i++)
		{
			if(ar[i].equals(o))
			{
				return i;
			}
		}
		return -1;
	}
	@Override
	public boolean addAll(E ar) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

