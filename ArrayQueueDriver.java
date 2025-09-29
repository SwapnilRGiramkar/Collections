//This was the Driver Class of ArrayQueue
package collections;

public class ArrayQueueDriver
{
	public static void main(String[] args) throws WrongInitialCapacity
	{
		ArrayQueue <Integer> aq= new ArrayQueue<Integer>();
		aq.add(10);
		aq.add(20);
		aq.add(30);
		aq.add(40);
		aq.add(50);
		aq.add(60);
		aq.add(70);
		aq.add(80);
		aq.add(90);
		aq.add(100);
		
		aq.remove();
		aq.remove();
		aq.remove();
		aq.add(1999);
		aq.remove();
		System.out.println(aq);
		aq.offer(2002);
		aq.remove();
		aq.remove();
		aq.remove();
		
		System.out.println(aq);
		System.out.println();
		System.out.println(aq.peek());
		System.out.println(aq);
		System.out.println(aq.poll());
		System.out.println(aq);
	}
}

