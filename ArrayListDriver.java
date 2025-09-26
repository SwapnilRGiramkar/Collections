//ArrayList Driver which is Driver class of ArrayList
package collections;

public class ArrayListDriver 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		a.removeFrom(2);
		System.out.println(a);
		a.removeAll();
		System.out.println(a);
		System.out.println(a.count);
//		a.addIndex(1, 80);
//		System.out.println(a);
//		System.out.println(a.count);
//		//a.clear();
//		System.out.println(a.isEmpty());
//		//a.removeIndexOb(1, 80);
//		System.out.println(a.get(1));
//		System.out.println(a);
//		System.out.println(a.size());
//		a.remove(80);
//		System.out.println(a);
//		a.removeIndex(0);
//		System.out.println(a);
//		a.removeIndexOb(0, 20);
//		System.out.println(a);
		System.out.println(a.isEmpty());
		
	}
}

