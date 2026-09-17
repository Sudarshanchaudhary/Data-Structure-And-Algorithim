class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n=arr.length;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int len[]=new int[n];
        int left=0;

        Arrays.fill(len,Integer.MAX_VALUE);

        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            
             if (sum == target) {
                int length = right - left + 1;

                if (left > 0 && len[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, length + len[left - 1]);

                    if (ans == 2) {
                        return 2;
                    }
                }

                len[right] = length;
            }

            if (right > 0) {
                len[right] = Math.min(len[right], len[right - 1]);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
        }

    
        
    }
