import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(0);
		l.add(5);
		l.add(2);
//		l.add(8);
//		l.add(6);
		
		l = sort(l);
		for(int i : l)
			System.out.println(i);
	}

	private static List<Integer> sort(List<Integer> l) {
		//base consition
		if(l.size() == 1)
			return l;
		//hypothesis
//		/System.out.println("list size "+l.size());
		Integer temp = l.get(l.size()-1);
//		System.out.println(temp);
		l.remove(l.size()-1);
//		System.out.println("ada before "+l+" "+temp) ;
		l = sort(l);
//		System.out.println("ada "+l+" "+temp);
		//induction
		return l = insert(l, temp);
	}

	private static List<Integer> insert(List<Integer> l, int i) {
//		System.out.println("inside insert "+l);
		//baseCondition
		if(l.size() == 0 || i >= l.get(l.size()-1))
		{
			l.add(i);
			return l;
		}
		//hypothesis
		int val = l.get(l.size() - 1);
		l.remove(l.size()-1);
		l = insert(l, i);
		//induction
		l.add(val);
		return l;
	}

//	public static void main(String[] args) {
//		int arr[]={2,3,7,6,4,5,9};
//		//System.out.println(arr[2]);
//		int n=arr.length-1;
//		sort(arr,n);
//
//	}
//
//	public static int sort(int [] ar,int len)
//	{
//		if(len == 0)
//		{
//			System.out.println(ar[len]+" "+len);
//			return ar[0];
//		}
//		System.out.println(ar[len]+" "+len);
//		sort(ar,len-1);
//
//		return len;
//
//	}

}
