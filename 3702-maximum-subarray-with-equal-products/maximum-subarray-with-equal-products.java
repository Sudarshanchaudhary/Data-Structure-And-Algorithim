
class Solution {
    public int maxLength(int[] nums) {

        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            long product = 1;
            int gcd = nums[i];
            long lcm = nums[i];

            for(int j = i; j < nums.length; j++) {

                product *= nums[j];

                gcd = findGcd(gcd, nums[j]);

                lcm = (lcm / findGcd((int)lcm, nums[j])) * nums[j];

                if(product == gcd * lcm) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }

    public int findGcd(int a, int b) {

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
