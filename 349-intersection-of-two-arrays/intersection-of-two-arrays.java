class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        int[]result=new int[n];
        int left=0;
        int right=0;
        int k=0;

        while(left<n && right<m){
           if(nums1[left]==nums2[right]){
            if(k==0||result[k-1]!=nums1[left]){
                result[k]=nums1[left];
                k++;
            }
            left++;
            right++;
           }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }

    
        return Arrays.copyOf(result,k);
    }
}