class Solution {
    public int triangleNumber(int[] nums) {

Arrays.sort(nums);
        int n=nums.length;
        
        int count=0;

        for(int i=n-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<=right){
                int sum= nums[left]+nums[right];

                if(sum>nums[i]){
                count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return count;
    }
}