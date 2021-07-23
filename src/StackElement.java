import java.util.Stack;

public class StackElement {

	public static void main(String[] args) {
		Stack st=new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5); 
		st.push(9);
		st.push(10);
		//System.out.println(st);
		//System.out.println(st.size());
		int middle=0;
		if((st.size()/2) % 2==0)
		{
			middle=st.size()/2;
			
			
		}
		else
			middle=st.size()/2 +1;
		System.out.println(middle);
//		st=deleteMiddle(st ,middle);
		System.out.println(st);
		//System.out.println(156%10);
		
		
		
	}

	private static Stack deleteMiddle(Stack st, int middle) 
	{
		//base condition
		if(middle==1)
		{
			st.pop();
			return st;
		}
		
//		hypothesis
		int val = (int)st.pop();
		deleteMiddle( st , middle-1 );
//		induction
		st.push(val);
		return st;
		
		
	}

}
