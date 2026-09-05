class Solution {
    public int countTriplets(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int temp = 0;
            for(int k = i; k < n; k++) {
                temp ^= arr[k];
                if(temp == 0) {
                    count += k - i;
                }
            }
        }
        return count;
    }
}