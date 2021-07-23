import java.util.Comparator;
import java.util.PriorityQueue;

public class k_closest {
    public static void main(String args[]) {
        int arr[][] = {{1, 3}, {-1, 2}, {5, 8}, {0, 1}};
        int k = 2;
        PriorityQueue<pointPair> pq = new PriorityQueue<pointPair>(new pointPair());

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            int dis = (int) (Math.pow(x, 2) + Math.pow(y, 2));
            pq.add(new pointPair(x, y, dis));
            if (pq.size() > k) {
                pq.poll();
            }

        }
        int a[][] = new int[k][2];
        int z = 0;
        while (pq.size() > 0) {
            pointPair pair = pq.poll();
//                a[i][0]=pair.arr[0];
//                a[i][1]=pair.arr[1];
            System.out.println(pair.arr[0] + " " + pair.arr[1]);

            z++;
        }
    }
}

    class pointPair implements Comparator<pointPair> {

        int arr[] = new int[2];
        int value;

        pointPair(int x, int y, int value) {
            this.arr[0] = x;
            this.arr[1] = y;
            this.value = value;
        }

        pointPair() {
        }

        @Override
        public int compare(pointPair p1, pointPair p2) {
            return p2.value - p1.value;  //max-heap;
        }

    }
