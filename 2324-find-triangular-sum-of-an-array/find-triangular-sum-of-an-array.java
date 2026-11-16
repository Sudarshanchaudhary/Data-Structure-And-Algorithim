class Solution {
    public int triangularSum(int[] nums) {
        while(nums.length>1){
            int[]result= new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                result[i]=(nums[i]+nums[i+1])%10;
            }
            nums=result;
        }
        return nums[0];
        
    }
}