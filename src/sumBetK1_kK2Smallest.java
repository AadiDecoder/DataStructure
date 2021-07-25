import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class sumBetK1_kK2Smallest {
    public static void main(String[] args) {
        int arr[]= {7,10,4,3,20,15};
        int k1=1;
        int k2=4;
        int sum=0;

        int k1Small=summ1(arr,k1);
        int k2Small=summ1(arr,k2);
        Arrays.sort(arr);
        int smallIn=0;
        int largeIn=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k1Small){
                smallIn=i;
            }
            if(arr[i]==k2Small){
                largeIn=i;
            }
        }
        for(int j=smallIn+1;j<largeIn;j++){
            sum=sum+arr[j];
        }
        System.out.println(sum);
    }

    private static int summ1(int[] arr,int k1) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k1){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
