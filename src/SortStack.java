import java.util.Stack;

public class SortStack {

    public static void main(String[] args)
    {
        Stack st=new Stack();
        st.push(2);
        st.push(5);
        st.push(3);
        st.push(6);
        st.push(10);
        st.push(1);

        System.out.println(st);
        sortSta(st);

        System.out.println(st);
    }

    private static void sortSta(Stack st) {
        //base condition
        if(st.size()==1)
        {
            return;
        }
        int temp=(int)st.pop();

        sortSta(st);

       st=insert(st , temp);


    }

    private static Stack  insert(Stack st, int temp) {   //temp=5 and st = 6
        if(st.size()==0 || temp > (int)st.peek())
        {
            st.push(temp);
            return st;
        }

        int lo=(int)st.pop();   //6 will get popped

        insert(st,temp);     //empty stack , 5

        st.push(lo);
        return st;
    }
}
