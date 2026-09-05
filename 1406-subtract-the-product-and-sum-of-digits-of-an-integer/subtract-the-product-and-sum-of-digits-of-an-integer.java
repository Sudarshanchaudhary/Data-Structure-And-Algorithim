class Solution {
    public int subtractProductAndSum(int n) {

        if(n==0){
            return 0;
        }
int temp=n;
int sum=0;
int product=1;

while(temp>0){
    int digit= temp%10;
    sum=sum+digit;
    product=product * digit;
    temp=temp/10;

}

int result= product - sum;
return result;
        
    }
}