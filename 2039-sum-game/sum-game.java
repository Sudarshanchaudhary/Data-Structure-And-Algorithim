class Solution {
    public boolean sumGame(String num) {

        int n=num.length();
        int s1=0;
        int s2=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<n/2;i++){
            char ch=num.charAt(i);
            if(ch=='?'){
                c1++;
            }
            else{
              s1+=ch-'0';
            }
        }

        for(int i=n/2;i<n;i++){
            char ch=num.charAt(i);
            if(ch=='?'){
                c2++;
            }
            else{
                s2+=ch-'0';
            }
        }

        if(((c1+c2)&1)==1){
            return true;
        }

        return(s1-s2)!=9*(c2-c1)/2;
        
    }
}