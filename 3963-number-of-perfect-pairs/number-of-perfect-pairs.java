class Solution {
    public long perfectPairs(int[] nums) {

        
        int n=nums.length;
        int left=0;
        int right=1;
        long count=0;

        for(int i = 0; i < n; i++) {
    nums[i] = Math.abs(nums[i]);
}
Arrays.sort(nums);
        while(right<n){
             long a=Math.abs((long)nums[left]);
            long b=Math.abs((long)nums[right]);

            if(b<= 2*a){
                count+=right-left;
                right++;
            }
            else{
                left++;
            }
        }
        return count;
        
    }
}