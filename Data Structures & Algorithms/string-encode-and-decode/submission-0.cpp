class Solution {
public:

    string encode(vector<string>& strs) {
        string result = "", j;
        int i, k;
        for(i = 0;i<strs.size();i++){
           j = to_string(strs[i].length());
           for(k=j.length();k<3;k++) j = "0" + j;
           result = result + j + strs[i];
        }
        return result;
    }

    vector<string> decode(string s) {
        int i ,j;
        string next;
        vector<string> result;
        for(i = 0;i<s.length();){
            j=(i+3)+(s[i]-'0')*100+(s[i+1]-'0')*10+(s[i+2]-'0');
            i = i+3;
            next = "";
            for(i;i<j;i++) next += s[i];
            result.push_back(next);
        }
        return result;
    }
};
