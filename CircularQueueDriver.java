//This was the Example of Circular Queue Driver"
package collections;

public class CircularQueueDriver 
{
	public static void main(String[] args) throws WrongInitialCapacity 
	{
		   CircularQueue<Integer> q = new CircularQueue<Integer>(5);

	        q.add(10);
	        q.add(20);
	        q.add(30);
	        System.out.println(q); // [10, 20, 30]

	        System.out.println(q.poll()); // 10
	        System.out.println(q);        // [20, 30]

	        q.add(40);
	        q.add(50);
	        q.add(60);
	        System.out.println(q); // [20, 30, 40, 50, 60]
	        q.remove();
	        q.add(15);
	        System.out.println(q.peek()); // 20
	        System.out.println(q);
	}
}

