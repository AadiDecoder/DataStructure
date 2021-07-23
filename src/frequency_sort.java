import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequency_sort {

	public static void main(String[] args) {
		int arr[]= {1,1,1,3,2,2,2,5};
		int k=2;
		HashMap<Integer,Integer> hm=new HashMap<>();
		PriorityQueue<PairSort> pq=new PriorityQueue<PairSort>(new PairSort());
		
		
		//Time Complexity : O(n)
		for(int i=0; i < arr.length ; i++)
		{
			if(hm.containsKey(arr[i]))
			{
				int a=(int)hm.get(arr[i]);
				a++;
				hm.put(arr[i], a);
			}
			else 
			{
				hm.put(arr[i] , 1);
			
			}
		}
		

		//Time Complexity : O(K) k<=n
		 for (Map.Entry<Integer , Integer> e : hm.entrySet())
		 {
	            
	            pq.add(new PairSort((int)e.getKey() , (int)e.getValue()));
	           
	            
		 }
		 //Time Complexity : O(K*N)
		 while(!pq.isEmpty())
		 { 
			 int ke = pq.peek().key;
			 int val=pq.peek().freq;
			 pq.poll();
			 while(val>0) {
				 System.out.print(ke+" ");
				 val--;
			 }
			 
			 
		 }
	}

}
class PairSort implements Comparator<PairSort>{
	int key;
	int freq;
	
	PairSort(int key , int freq)
	{
		this.key=key;
		this.freq=freq;
	}
	
	PairSort(){
		
	}

	//we have to make Max heap
	@Override
	public int compare(PairSort p1, PairSort p2) { //p1 always will be the new object and p2 will be the existing object from which we make comparision
		
		if(p1.freq == p2.freq)
		{
			if(p1.key > p2.key)
			{
				return -1;  
			}
		}
			
		if(p1.freq > p2.freq) {
			return -1;
		}
		else {
			return +1;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(key);
	}
}

