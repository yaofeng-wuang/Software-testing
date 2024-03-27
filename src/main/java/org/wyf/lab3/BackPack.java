package org.wyf.lab3;

public class BackPack {
    public int backPack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            int weight = weights[i - 1];
            int value = values[i - 1];

            for (int j = 1; j <= capacity; j++) {
                if (weight <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][capacity];
    }
}
