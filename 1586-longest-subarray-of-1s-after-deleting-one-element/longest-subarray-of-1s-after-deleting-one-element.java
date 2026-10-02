class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen=0;
        int zeroCount=0;
        int left=0;
        for(int right=0; right<nums.length;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            int len= right-left+1;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen-1;
        
    }
}