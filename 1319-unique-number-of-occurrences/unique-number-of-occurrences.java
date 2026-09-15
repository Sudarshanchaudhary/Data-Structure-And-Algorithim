class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        HashSet<Integer> set=new HashSet<>();
        for(int value:map.values()){
            if(set.contains(value)){
                return false;
            }
            set.add(value);
        }
        return true;
    }
}