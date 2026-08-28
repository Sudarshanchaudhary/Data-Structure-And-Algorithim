class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n];
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {

            int freq = map.getOrDefault(nums[i], 0);

            if(freq < k) {
                result[count] = nums[i];
                count++;
                map.put(nums[i], freq + 1);
            }
        }

        return Arrays.copyOf(result, count);
    }
}