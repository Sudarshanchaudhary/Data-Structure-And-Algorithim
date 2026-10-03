class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int n=s.length();
        int max=0;
        int count=0;
        for(int right=0;right<n;right++){
            
            if(isVowel(s.charAt(right))){
                count++;
            }
          if(right-left+1>k){
            if(isVowel(s.charAt(left))){
                count--;
            }
            left++;
          }
            
            
            max=Math.max(max,count);
        }
        return max;
        
    }
   public boolean isVowel(char ch){
    return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
   }
}