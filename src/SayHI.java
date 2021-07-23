import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SayHI {

	static int i=10;
	public static void main(String[] args) {
//		String s="Adarsh";

		//System.out.println(charRemoveAt(s,2 ));

//		System.out.println(Character.isLetter('1'));
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		System.out.println(arr);
//		Collections.reverse(arr);
//		System.out.println(arr);

		//ENUM
		//System.out.println(Beer.KF);
//		Beer b[]=Beer.values();
//		for(Beer b1 : b)
//		{
//			System.out.println( b1 +" "+ b1.ordinal()+ " "+b1.name()) ;
//		}
// 
//		int l=Beer.values().length;
//		System.out.println(l);
		//PrioirutQueue by default Min heap in java

//		 PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
//
//	        // Adding items to the pQueue using add()
//	        pQueue.add(10);
//	        pQueue.add(30);
//	        pQueue.add(20);
//	        pQueue.add(400);
//
//	        // Printing the most priority element
//	        System.out.println("Head value using peek function:" + pQueue.peek());
//	        System.out.println(pQueue);
//
//	    byte b=10;
//
//		System.out.println(((Object)b).getClass().getName());
//		byte b=10;
//		byte a=20;
//		byte c=20+10;
//		System.out.println(10/0);


		int i=10;
		if(i>9){
			throw new myException("Number is not valid");
		}

	}


}
class myException extends RuntimeException{
	String msg="";
public myException(String msg){
   this.msg=msg;
		}
		public String toString(){
              System.out.println("hey");
              return msg+"hahah";
		}
		}
