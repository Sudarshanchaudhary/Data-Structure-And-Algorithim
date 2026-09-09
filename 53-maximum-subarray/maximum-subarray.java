class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int start=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int v1= start+nums[i];
            int v2= nums[i];
           if(v1>v2){
            start=v1;
           }
          else{
            start=v2;
          }

           if(start>ans){
            ans=start;
           }
        }
        return ans;
        
    }
}