import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class k_frequency {
	

	public static void main(String[] args) {
		int arr[]= {1,1,1,3,2,2,5};
		int k=2;
		HashMap<Integer,Integer> hm=new HashMap<>();
		PriorityQueue<Pair> pq=new PriorityQueue<Pair>(new Pair());
		
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
		
//		while(!hm.isEmpty())
//		{
//		
//			
////			pq.add(e)
//		}
		 for (Map.Entry<Integer , Integer> e : hm.entrySet())
		 {
	            System.out.println("Key: " + e.getKey()
	                               + " Value: " + e.getValue());
	            pq.add(new Pair((int)e.getKey() , (int)e.getValue()));
	            System.out.println("inside for "+pq+ " "+pq.size()+" top "+pq.peek());
	            if(pq.size() > k) {
	            	
	            	pq.poll();
	            	System.out.println("inside if "+pq);
	            }
		 }
		 
		 System.out.println(pq);
		

	}

}
class Pair implements Comparator<Pair>{
	int key;
	int freq;
	
	Pair(int key , int freq)
	{
		this.key=key;
		this.freq=freq;
	}
	
	Pair(){
		
	}

	//we have to make min heap
	@Override
	public int compare(Pair p1, Pair p2) { //p1 always will be the new object and p2 will be the existing object form which we make comparision
		
//		if(p1.freq==p2.freq)
//			return 0;
//		if(p1.freq < p2.freq) {
//			System.out.println("p1 "+p1.freq+" p2 "+p2.freq);
//			return -1;//no change
//		}
//		else {
//			return +1; //change the order;
//		}
		return p1.freq - p2.freq;
		//for max heap
		//return p2.freq -p1.freq;
	}
	
	@Override
	public String toString() {
		return String.valueOf(key);
	}
}
