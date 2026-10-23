class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
         vector<vector<int>> result;
         sort(intervals.begin(),intervals.end());
         int n=intervals.size();
         int start1= intervals[0][0];
         int end1= intervals[0][1];
         for(int i=0;i<n;i++){
            int start2= intervals[i][0];
            int end2= intervals[i][1];
            if(start2<= end1){
                end1=max(end1,end2);
            }
            else{
                result.push_back({start1,end1});
                start1=start2;
                end1=end2;
            }
         }
         result.push_back({start1,end1});
         return result;
        
    }
};