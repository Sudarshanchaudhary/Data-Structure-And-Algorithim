
class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[] last = new int[m];
        int[] ans = new int[m];

        // last[j] = word1 me word2[j] ka
        // rightmost possible index
        java.util.Arrays.fill(last, -1);

        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
            i--;
        }

        // Ek character mismatch karne ki permission hai
        boolean canChange = true;

        j = 0;

        for (i = 0; i < n && j < m; i++) {

            // Exact match
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                j++;
            }

            // Current character ko change karke match kar sakte hain
            else if (canChange &&
                    (j == m - 1 || i < last[j + 1])) {

                ans[j] = i;
                j++;
                canChange = false;
            }
        }

        // Pura word2 match nahi hua
        if (j != m) {
            return new int[0];
        }

        return ans;
    }
}

