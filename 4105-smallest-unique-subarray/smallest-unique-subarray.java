class Solution {

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        int[] sa = buildSuffixArray(nums);
        int[] rank = new int[n];
        for (int i = 0; i < n; i++)
            rank[sa[i]] = i;

        int[] lcp = buildLCP(nums, sa, rank);

        int ans = n;

        for (int i = 0; i < n; i++) {

            int pos = rank[i];

            int left = 0;
            int right = 0;

            if (pos > 0)
                left = lcp[pos - 1];

            if (pos < n - 1)
                right = lcp[pos];

            int need = Math.max(left, right) + 1;

            if (need <= n - i)
                ans = Math.min(ans, need);
        }

        return ans;
    }

    private int[] buildSuffixArray(int[] s) {

        int n = s.length;

        Integer[] order = new Integer[n];
        int[] rank = new int[n];
        int[] tmp = new int[n];

        for (int i = 0; i < n; i++) {
            order[i] = i;
            rank[i] = s[i];
        }

        for (int k = 1; k < n; k <<= 1) {

            final int K = k;
            final int[] r = rank;

            Arrays.sort(order, (a, b) -> {

                if (r[a] != r[b])
                    return Integer.compare(r[a], r[b]);

                int ra = a + K < n ? r[a + K] : -1;
                int rb = b + K < n ? r[b + K] : -1;

                return Integer.compare(ra, rb);
            });

            tmp[order[0]] = 0;

            for (int i = 1; i < n; i++) {

                int a = order[i - 1];
                int b = order[i];

                boolean same = rank[a] == rank[b];

                same &= (a + K < n ? rank[a + K] : -1)
                        == (b + K < n ? rank[b + K] : -1);

                tmp[b] = tmp[a] + (same ? 0 : 1);
            }

            System.arraycopy(tmp, 0, rank, 0, n);

            if (rank[order[n - 1]] == n - 1)
                break;
        }

        int[] sa = new int[n];

        for (int i = 0; i < n; i++)
            sa[i] = order[i];

        return sa;
    }

    private int[] buildLCP(int[] s, int[] sa, int[] rank) {

        int n = s.length;

        int[] lcp = new int[n - 1];

        int h = 0;

        for (int i = 0; i < n; i++) {

            int r = rank[i];

            if (r == n - 1) {
                h = 0;
                continue;
            }

            int j = sa[r + 1];

            while (i + h < n && j + h < n && s[i + h] == s[j + h])
                h++;

            lcp[r] = h;

            if (h > 0)
                h--;
        }

        return lcp;
    }
}