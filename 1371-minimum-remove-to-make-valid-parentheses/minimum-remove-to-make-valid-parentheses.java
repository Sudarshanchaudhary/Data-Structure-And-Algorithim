class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack= new Stack<>();
        StringBuilder str= new StringBuilder(s);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                stack.push(i);
            }
            else if(ch==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    str.setCharAt(i,'*');
                }
            }
        }

        while(!stack.isEmpty()){
            str.setCharAt(stack.pop(),'*');
        }

        StringBuilder ans= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='*'){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
        
    }
}