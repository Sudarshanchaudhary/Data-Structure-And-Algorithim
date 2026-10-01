class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=right+(left-right)/2;
            int correctNo= mid+1;
            int missingNumber= arr[mid]-correctNo;

            if(missingNumber>=k){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right+1+k;
        
    }
}