class Solution {
    public int minimumDeletions(int[] nums) {

        int n=nums.length;
        int minIndex=0;
        int maxIndex=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIndex]){
                minIndex=i;
            }
            if(nums[i]>nums[maxIndex]){
                maxIndex=i;
            }
        }
        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);

        int point1=right+1;
        int point2= n-left;
        int point3=(left+1)+(n-right);

        return Math.min(point1,Math.min(point2,point3));
        
    }
}