import java.util.Stack;

public class ReverseStack {
static int i=0;
	public static void main(String[] args) {
Stack st=new Stack();
		
		st.push(2);
		st.push(4);
		st.push(5);
		st.push(6);
//		st.push(5); 
//		st.push(9);
//		st.push(10);
		
		int size=st.size();
		System.out.println(st);
		reverseStack(st);
		System.out.println(st);
	}

	private static void reverseStack(Stack st ) {
		if(st.size()==0)
			return ;
		
		int val=(int)st.pop();  //6 ,5 ,4 , 2
		reverseStack(st);
		
		//System.out.println("ada "+st+" "+val);
		System.out.println(st);
		insert(st,val);
      return;		

	}
	private static void insert(Stack st, int val)
	{
		if(st.size()==0) 
		{
			st.push(val);
		    return ;
		}
	  int temp=(int)st.pop();
	 // System.out.println(temp);
	  insert(st,val);
	  st.push(temp);
	  return ;
	}

}
