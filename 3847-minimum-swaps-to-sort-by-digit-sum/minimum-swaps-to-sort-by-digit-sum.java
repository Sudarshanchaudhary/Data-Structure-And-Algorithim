

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int swap = 0;
        int[][] result = new int[n][3];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int temp = nums[i];

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            result[i][0] = sum;
            result[i][1] = nums[i];
            result[i][2] = i;
        }

        Arrays.sort(result, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || result[i][2] == i) {
                continue;
            }

            int j = i;
            int count = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = result[j][2];
                count++;
            }

            swap += count - 1;
        }

        return swap;
    }
}