
public class Insertion {
	static int  arr[]= {101,9,8,27,6,5,4,223,2,1,2220};
	public static void main(String[] args) {

		int inc=2;
		//lets sort it rhu selection sorting
		while(inc >=1) {
			for(int index=0; index< inc ; index++) {
		for(int i=0;i<=arr.length ; i=i+inc) 
		{
			boolean swapped=false;
			//int sorted=arr[i];
			for(int j=Math.min(i+inc , arr.length-1) ; j-inc >= 0 ;j=j-inc) 
			{
				//System.out.println("adarsh "+ arr[j-inc] +"and j "+arr[j] );
				if( arr[j-inc] > arr[j]) 
				{
					int k=arr[j];
					int t=arr[j-inc];
					arr[j]=arr[j-inc];
					arr[j-inc]=k;
					//System.out.println(arr[j-inc]);
					swapped=true;
				}
				else {
					break;
				}
				
				
			}
			
		}
		}
			inc=inc-1;
		}
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		BinarySearch(0, arr.length);
		
	}
	public static void BinarySearch( int low , int high) {

		//Binary search
	 int search=123;
		int half=(low+high)/2;
        if(search == arr[half]) {
        	half=half+1;
        	System.out.println("Your Value has been found out"+search +"at index"+half);
        	return;
        }
        else if(search > arr[half]) {
        	int i=half+1;
        	int j=high;
        	BinarySearch(i, j);
        	
        }
        else if (search < arr[half]){
        	int i=0;
        	int j=half-1;
        	BinarySearch(i, j);
        }
        else {
        	System.out.println("Sorry , Your Value is not inside this array");
        	return;
        }
	}

}
