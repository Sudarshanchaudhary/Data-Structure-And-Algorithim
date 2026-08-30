class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxPoint=0;
        int minPoint=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minPoint]){
                minPoint=i;
            }
            if(nums[i]>nums[maxPoint]){
                maxPoint=i;
            }
        }

        int left=Math.min(minPoint,maxPoint);
        int right=Math.max(minPoint,maxPoint);
        int point1=right+1;
        int point2=n-left;
        int point3=(left+1)+(n-right);
        return Math.min(point1,Math.min(point2,point3));
        
    }
}