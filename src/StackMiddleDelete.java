import java.util.Stack;

public class StackMiddleDelete {
    public static void main(String[] args)
    {
     Stack st=new Stack();
     st.push(3);
     st.push(5);
//     st.push(4);
//     st.push(1);
//     st.push(6);
//     st.push(7);
     int mid=st.size()/2;

     if(st.size()>2) {   //delete mid element only if stack contains more than 2 element in it
         deleteMiddle(st, mid);
     }
     System.out.println(st);

    }

    private static void deleteMiddle(Stack st, int mid) {
        if(st.size()-1==mid)
        {
            st.pop();
            return;
        }
        int temp=(int)st.pop();
        deleteMiddle(st,mid);
        st.push(temp);

    }
}
