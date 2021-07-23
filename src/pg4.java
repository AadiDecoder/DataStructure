import java.util.Comparator;
import java.util.PriorityQueue;

class Pair1 implements Comparator<Pair1> {
	int key;
	int value;

	Pair1() {

	}

	Pair1(int key, int value) {
		this.key = key;
		this.value = value;
		//System.out.println(value);
	}
//max heap;
	public int compare(Pair1 p1, Pair1 p2) {
		//System.out.println(p2.value +" "+p1.value);
//		if (p1.value == p2.value)
//			return 0;     // no change
//		if (p1.value < p2.value)
//			return +1;   // change the order
//		else
//			return -1;  // no change
		return p2.value - p1.value;

	}
public 	String toString()
	{
		return String.valueOf(key);
	}
	
}

public class pg4 {
//	
	static int abs(int a, int b) {

		return b - a < 0 ? a - b : b - a;
	}

	public static void main(String[] args) {
		int[] arr = { 5,6,7,8,9};
		int x = 20;  //jis number ke nearest  apne ko nikalna h  k closest number
		PriorityQueue<Pair1> q = new PriorityQueue<Pair1>(new Pair1());
		int k=3;
		for (int i = 0; i < arr.length; i++)
		{
			q.add(new Pair1(arr[i], abs(arr[i], x)));
			//System.out.println("adarsh"+ q.peek());
			if(q.size()>k)
				q.poll();
	}
            while(!q.isEmpty())
            {
            	System.out.println(q.poll());
            }
	}
}