public class SortArrayRecursive {
    public static void main(String[] args){
        int arr[]={2,5,1,3,10,9,11,12,13};

        sortArray(arr , arr.length-1);
        for(int i=0; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    private static void sortArray(int[] arr , int size) {
        if(size == 1){
            return;
        }
        int temp=arr[size-1];

        sortArray(arr , size-1);

        insert(arr,temp,size-1);

    }

    private static void insert(int[] arr, int temp , int size) {
        if(size ==0 || temp >= arr[size-1])
        {
            arr[size]=temp;
            return;
        }
        int loc=arr[size-1];
        insert(arr , temp , size-1);
        arr[size]=loc;
        return;
    }
}
