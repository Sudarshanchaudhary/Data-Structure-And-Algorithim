class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=0;
        int[] ans=new int[n];
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();

        for(int i=0;i<n;i++){
            map1.put(nums1[i],1);
        }
        for(int i=0;i<m;i++){
            map2.put(nums2[i],1);
        }
       for(int num : map1.keySet()){
    if(map2.containsKey(num)){
        ans[k] = num;
        k++;
    }
}
        return Arrays.copyOf(ans, k);

        
    }
}