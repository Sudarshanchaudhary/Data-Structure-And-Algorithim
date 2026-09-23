class Solution {
    public int minOperations(int[] nums, int x) {

        int n=nums.length;
        int sum=0;
        int addition=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }

        int target= sum-x;
        if(target<0){
            return -1;
        }
        int left=0;
        for(int right=0;right<n;right++){
            addition+=nums[right];

            while(addition>target){
            addition-=nums[left];
            left++;

            }
           if(addition==target){
            int len=right-left+1;
            ans=Math.max(ans,len);
           }
        }
        if(ans==-1){
            return -1;
        }
        return n-ans;
        
    }
}