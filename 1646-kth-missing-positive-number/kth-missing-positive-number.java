class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        for(int i=1;i<=2000;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                count++;
                 if(count==k){
                return i;
            }
            }
           
        }
        return -1;
        
    }
}