
public class Bubble {

	public static void main(String[] args) {
int arr[]= {101,9,8,27,6,5,4,223,2,1,2220};
		
		//lets sort it rhu selection sorting
System.out.println(arr.length);
		for(int i=arr.length-1;i>0;i--) 
		{
			for(int j=i-1 ;j < i;j++) 
			{
				if(arr[j] > arr[i])
				{
					int k = arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.println("Array Length "+arr.length);
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
