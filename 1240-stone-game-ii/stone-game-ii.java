class Solution {

    int[][] dp;
    int[] suffix;

    public int stoneGameII(int[] piles) {

        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        // Suffix sum
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = piles[i] + suffix[i + 1];
        }

        return solve(piles, 0, 1);
    }

    private int solve(int[] piles, int index, int M) {

        // Saare piles khatam
        if (index >= piles.length) {
            return 0;
        }

        // Agar state already calculate ho chuki hai
        if (dp[index][M] != 0) {
            return dp[index][M];
        }

        int best = 0;

        // X = 1 to 2*M
        for (int X = 1;
             X <= 2 * M && index + X <= piles.length;
             X++) {

            int nextM = Math.max(M, X);

            // Opponent maximum stones lega
            int opponent = solve(piles, index + X, nextM);

            // Current player ke maximum stones
            int current = suffix[index] - opponent;

            best = Math.max(best, current);
        }

        dp[index][M] = best;

        return best;
    }
}