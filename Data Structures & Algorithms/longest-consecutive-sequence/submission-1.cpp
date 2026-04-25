class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        unordered_set<int> s;
        int i, result = 1, temp;
        for(i=0;i<nums.size();i++){
            s.insert(nums[i]);
        }
        for (auto it = s.begin(); it != s.end(); it++){
            i = *it;
            if(s.find(i - 1) == s.end()){
                temp = i-1;
                while(s.find(i+1) != s.end()) i++;
                result = max(result, i-temp);
            }
        }
        return result; 
    }
};
