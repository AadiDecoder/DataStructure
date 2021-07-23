import java.util.Arrays;

public class KthGrammarThruArray {
    public static void main(String[] args){
        int N=2;
        int k=5;
        //if i=0 :: 0 and 1;
        //if i=1 :: 1 and 0
        int arr[][]=new int[N][N*2];
        for(int x=0;x<arr.length;x++)
            Arrays.fill( arr[x], -1 );
        arr[0][0]=0;
        arr[1][0]=0;
        arr[1][1]=1;
        for(int i=2;i<N;i++)
        {
            for(int j=0;j < N*2;j++)
            {
                if(arr[i-1][j]==0)   //i=2-1=1, j=0 , i=1 and j=1
                {
                    arr[i][j*2]=0;
                    arr[i][(j*2)+1]=1;
                }
                else if(arr[i-1][j]==1)
                {
                    arr[i][(j*2)]=1;
                    arr[i][(j*2)+1]=0;
                }
            }
        }
        for(int i=0; i<N;i++)
        {
            for(int j=0; j < N*2 ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(arr[N-1][k-1]);
    }
}
