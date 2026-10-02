class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        int zeroCount=0;
        int left=0;
        int right=0;

        while(right< nums.length){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }

            if(zeroCount<=k){
                int len= right-left+1;
                maxLen= Math.max(len,maxLen);
            }
            right++;
        }
        return maxLen;
        
    }
}