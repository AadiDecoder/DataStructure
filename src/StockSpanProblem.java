import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		int arr[] = {100, 80, 60, 70,60, 75, 85};
		ArrayList al = new ArrayList();

		Stack<int[]> st = new Stack();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				al.add(-1);
			} else if (st.size() > 0 && st.peek()[0] > arr[i]) {
				al.add(st.peek()[1]);
			} else if (st.size() > 0 && st.peek()[0] <= arr[i]) {
//				int temp = i-1;
//				System.out.print(temp+" "+st.size()+" ");
				while (st.peek()[0] <= arr[i] && st.size()>0) {
					st.pop();
//					temp--;
				}
//				System.out.println(temp+" check "+i);
				if (st.size() == 0) {
					al.add(-1);
				} else {
					al.add(st.peek()[1]);
				}
			}
			st.push(new int[]{arr[i],i});
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(i -(int)al.get(i));
		}
	}
}
