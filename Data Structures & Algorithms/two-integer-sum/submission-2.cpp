class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<pair<int,int>> nums2;
        int i=0,j=nums.size()-1;
        for(i;i<nums.size();i++){
            nums2.push_back(make_pair(nums[i],i));
        }
        i=0;
        sort(nums2.begin(), nums2.end());
        while(i<j){
            if(nums2[i].first+nums2[j].first == target){
                return {min(nums2[i].second, nums2[j].second),max(nums2[i].second,nums2[j].second)};
            }
            else if(nums2[i].first+nums2[j].first > target){
                j--;
            }
            else{
                i++;
            }
        }
        return {};
    }
};
