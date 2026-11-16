class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;

           int modulo=1000000007;
           int oddNumber=0;
           int evenNumber=1;
           int sum=0;
           int count=0;
           for(int i=0;i<n;i++){
            sum+=arr[i];
              if(sum%2!=0){
                count=(count+evenNumber)%modulo;
                oddNumber++;      
              }
              else{
                count=(count+oddNumber)%modulo;
                evenNumber++;
              }
           }
           return count;
        
    }
}