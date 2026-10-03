class Solution {
    public int longestValidParentheses(String s) {
        int open=0;
        int close=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                int len= open+close;
                max= Math.max(len,max);
            }
            else if(close > open){
                open=0;
                close=0;
            }
        }
        open=0;
        close=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch= s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                int len= open+close;
                max= Math.max(len,max);
            }
            else if(open> close){
                open=0;
                close=0;
            }
        }
        return max;
        
    }
}