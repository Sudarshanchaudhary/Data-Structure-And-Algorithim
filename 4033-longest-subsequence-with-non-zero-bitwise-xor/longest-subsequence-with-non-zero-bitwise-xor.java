class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int n=nums.length;
        int zeroCount=0;
        for(int i=0;i<n;i++){
            xor=xor ^ nums[i];

            if(nums[i]==0){
                zeroCount++;
            }
        }

        if(xor!=0){
            return n;
        }
        if(zeroCount==n){
            return 0;
        }
        return n-1;
    }
}