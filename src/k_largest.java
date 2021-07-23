import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class k_largest {

	public static void main(String[] args) {
		 int arr[]= {7,10,4,3,20,15};
	       int k=3;
	       
//	       Arrays.sort(arr);
//	       System.out.println(arr[2]);
	       PriorityQueue<Integer> small=min_heap(arr,k);
	       System.out.println(small);
	       
	       

	}

	private static PriorityQueue<Integer> min_heap(int[] arr, int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(); //Min_heap;
		for(int i=0; i<arr.length;i++)
		{
			
			pq.add(arr[i]);
			if(pq.size() > k) {
				pq.poll();
			}
		}
		return pq;
	}

}
