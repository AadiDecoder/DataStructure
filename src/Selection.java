
public class Selection {

	public static void main(String[] args) {
		int arr[]= {101,9,8,27,6,5,4,223,2,1,2220};
		int temp;
		//lets sort it rhu selection sorting
		for(int i=0;i<arr.length;i++) 
		{
			int min = i ;
//			System.out.println(smallest);
			for(int j=i+1 ; j< arr.length ;j++) 
			{
				//System.out.println(arr[j]);
				if(arr[min] > arr[j]) 
				{
					
					min=j;
					
					
				}
			}
			//swap element;
			temp =arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Array Length "+arr.length);
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
