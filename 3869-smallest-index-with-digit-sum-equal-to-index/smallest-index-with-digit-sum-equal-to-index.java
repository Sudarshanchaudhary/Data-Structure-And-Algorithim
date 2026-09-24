class Solution {
    public int smallestIndex(int[] nums) {

        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int original=nums[i];
            int sum=0;

            while(original !=0){
                int digit=original%10;
                sum+=digit;
                original=original/10;

                
            }
            if(sum==i){
                return i;
                    
                }
        }
        return -1;
        
    }
}