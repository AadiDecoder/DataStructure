import java.util.PriorityQueue;

public class MinimumCost {
    public static void main(String[] args)
    {
        int arr[]={5,2,1,4,6};               //1+2 = 3 + 3 = 6  ,5+4=9   6+9=15
        PriorityQueue pq=new PriorityQueue();//3 + 6 +9+15
        for(int i=0; i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

        int x=(int)pq.poll();
        int y=(int)pq.poll();
        int sum=x+y;   //3
        pq.add(sum);
        while(!pq.isEmpty())
        {
          if(sum >= (int)pq.peek() && pq.size()>1)
          {
              x = (int) pq.poll();   //3
              y = (int) pq.poll();   //3
              sum = sum + x + y;     //3+3+3=9 //   4+5=9 //9+9=18 //9+6=15 // 15+18=33
              pq.add(x + y);    //6,9
          }
          else
          {
              break;
          }
        }
        System.out.println("adarsh"+sum);
    }
}
