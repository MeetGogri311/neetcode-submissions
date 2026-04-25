class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(), nums.end());
        int i,j,k,target;
        for(i=0;i<nums.size();i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            j=i+1,k=nums.size()-1, target = -nums[i];
            while(j<k){
                if(nums[j]+nums[k] == target){
                    result.push_back({nums[i], nums[j], nums[k]});
                    while(j < k && nums[j] == nums[j+1]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k] > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }
};