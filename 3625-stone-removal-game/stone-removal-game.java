class Solution {
    public boolean canAliceWin(int n) {
        int pathar=10;
        int count=0;

        while(n>=pathar){
            n= n- pathar;
            pathar--;
            count++;
        }
        return count %2==1;
        
    }
}