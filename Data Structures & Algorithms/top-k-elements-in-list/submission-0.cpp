class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> freq;
        int i;
        for(i=0;i<nums.size();i++){
            freq[nums[i]]++;
        }
        vector<int> result;
        vector<pair<int,int>> freqArr;
        for(auto it = freq.begin(); it != freq.end(); it++)
            freqArr.push_back(make_pair(it->second, it->first));
        sort(freqArr.rbegin(), freqArr.rend());
        for(i=0;i<k;i++) result.push_back(freqArr[i].second);
        return result;
    }
};
