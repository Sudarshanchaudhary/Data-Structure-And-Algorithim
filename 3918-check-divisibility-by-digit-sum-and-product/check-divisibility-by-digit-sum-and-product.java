class Solution {
    public boolean checkDivisibility(int n) {

        if(n<=9){
            return false;
        }

        int original=n;
        int sum=0;
        int product=1;

        while(n!=0){
            int digit= n % 10;
            sum=sum+digit;
            product=product * digit;
            n=n/10;
        }

        int total= sum+product;

        if(original % total==0){
            return true;
        }
        else{
            return false;
        }    
    }
}