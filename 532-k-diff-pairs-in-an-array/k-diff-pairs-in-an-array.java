class Solution {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);
        int n=nums.length;

        int left=0;
        int right= 1;
        int count=0;

      
if (k == 0) {
    int count1 = 0;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            count1++;

            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }

    return count1;
}



        while(right<n){
           int  difference=nums[right]-nums[left];
            if(difference==k){
                count++;

                 while(left< right && nums[left]==nums[left+1]){
                left++;
            }
            while(left< right && nums[right]==nums[right-1]){
                right--;
            }
                left++;
                right++;
            }
           
            else if(difference<k){
             right++;
            }
            else{
                left++;
            }
        }
        return count;

        
    }
}