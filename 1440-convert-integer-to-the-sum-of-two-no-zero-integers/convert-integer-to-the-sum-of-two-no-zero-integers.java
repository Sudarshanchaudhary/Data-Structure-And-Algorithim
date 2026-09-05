class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[]result=new int[2];

        for(int i=1;i<n;i++){
            int a=i;
            int b=n-i;

            
            if( handleZero(a) && handleZero(b)){
             result[0]=a;
             result[1]=b  ;
            }
        }
        return result;
        
    }

    public boolean handleZero(int num){
       while(num>0){
        if(num % 10==0){
            return false;
        }
        num=num/10;
       }
       return true;
    }
}