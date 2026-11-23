class Solution {
    public int minimizeSum(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;

        int answer1= nums[n-1]-nums[2];
        int answer2= nums[n-2]- nums[1];
        int answer3= nums[n-3]- nums[0];

        return Math.min(answer1,Math.min(answer2,answer3));
        
    }
}