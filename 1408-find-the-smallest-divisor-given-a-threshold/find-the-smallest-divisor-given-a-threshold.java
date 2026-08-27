class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int n=nums.length;
        Arrays.sort(nums);
        int range=nums[n-1];
        int left=1;
        int right=range;
        int ans=range;

        while(left<=right){
            int mid=left+(right-left)/2;
        
        int sum=0;
            for(int i=0;i<n;i++ ){
                sum+=(nums[i]+mid-1)/mid;
            }

            if(sum<=threshold){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }


          return ans;       
    }
}