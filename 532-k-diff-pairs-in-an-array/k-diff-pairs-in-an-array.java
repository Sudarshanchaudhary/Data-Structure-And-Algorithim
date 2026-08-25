class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++){
 if(i>0 && nums[i]==nums[i-1]){
    continue;
 }
           
           int left=i+1;
           int right=n-1;

           while(left<=right){
            int mid=left+(right-left)/2;
            int difference= nums[mid]-nums[i];

            if(difference==k){
                count++;
                break;
            }
            else if(difference<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
           }

        }
        return count;
        
    }
}