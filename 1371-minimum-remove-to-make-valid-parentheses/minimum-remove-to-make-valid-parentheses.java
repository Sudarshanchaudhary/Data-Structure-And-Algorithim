class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        String update="";
        int open=0;
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch>='a'&& ch<='z'){
                update=update+ch;
            }
            else if(ch=='('){
                open++;
                update=update+ch;
            }
            else if(open>0){
                open--;
                update=update+ch;
            }
        }
        int close=0;
        StringBuilder result= new StringBuilder();
        for(int i=update.length()-1;i>=0;i--){
            char ch=update.charAt(i);
            if(ch>='a'&& ch<='z'){
                result.append(ch);
            }
            else if(ch==')'){
                close++;
                result.append(ch);
            }
            else if(close>0){
                close--;
                result.append(ch);
            }
        }
        return result.reverse().toString();
        
    }
}