class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                int a = 0;
                for (int x = i; x < j; x++) {
                    a ^= arr[x];
                }

                for (int k = j; k < n; k++) {
                    int b = 0;
                    for (int x = j; x <= k; x++) {
                        b ^= arr[x];
                    }

                    if (a == b) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}