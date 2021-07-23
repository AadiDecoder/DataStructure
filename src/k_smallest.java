import java.util.Collections;
import java.util.PriorityQueue;

public class k_smallest {

	public static void main(String[] args) {
       int arr[]= {7,10,4,3,20,15};
       int k=3;
       
       int small=max_heap(arr,k);
       System.out.println(small);
	}

	private static int max_heap(int[] arr, int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());   //MAX-HEAP;
		
		for(int i=0 ; i < arr.length ; i++)
		{
//			if(pq.size() < k)
//			{
//				pq.add(arr[i]);
//				System.out.println("After "+pq.peek());
//			}
//			else 
//			{
//				pq.add(arr[i]);
//				pq.poll();
//			}
			pq.add(arr[i]);
			if(pq.size()>k) {
				pq.poll();
			}
			
		}
		return pq.peek();
	}

}
