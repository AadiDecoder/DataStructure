package com.Adarsh.dp;

public class LongestCommonSubsequenceDynamicProg {
    public static void main(String args[]) {
        String x = "abcdgh";
        String y = "abedfhr";

        char chX[] = x.toCharArray();
        char chY[] = y.toCharArray();


        int xl = chX.length;
        int yl = chY.length;
        //System.out.println(xl + " " + yl);
        int dp[][] = new int[xl + 1][yl + 1];
        for (int i = 0; i < xl + 1; i++) {
            for (int j = 0; j < yl + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i1 = 1; i1 < xl + 1; i1++) {
            for (int j1 = 1; j1 < yl + 1; j1++) {
                if (chX[i1 - 1] == chY[j1 - 1]) {
                    dp[i1][j1] = 1 + dp[i1 - 1][j1 - 1];
                } else {
                    dp[i1][j1] = Math.max(dp[i1 - 1][j1], dp[i1][j1 - 1]);
                }
            }
        }

        System.out.println(dp[xl][yl]);


    }
}
