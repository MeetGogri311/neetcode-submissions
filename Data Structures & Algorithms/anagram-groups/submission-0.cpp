class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,int> ana;
        vector<vector<string>> result;
        string temp;
        int i,j;
        for(i=0;i<strs.size();i++){
            int freq[26] = {};
            for(j=0;j<strs[i].length();j++){
                freq[strs[i][j]-'a']++;
            }
            temp = "";
            for(j=0;j<26;j++){
                temp= temp+ char('a'+j) + to_string(freq[j]);
            }
            auto k = ana.find(temp);
            if(k!=ana.end()){
                result[k->second].push_back(strs[i]);
            }
            else{
                result.push_back({strs[i]});
                ana.insert({temp, result.size()-1});
            }
        }
        return result;
    }
};
