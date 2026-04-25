class Solution {
public:
    bool isPalindrome(string s) {
        int i = 0,j = s.length()-1;
        while(i<j){
            // cout<<i<<" "<<j<<endl;
            if((s[i]) < '0' || (s[i] > '9' && s[i] < 'A') || (s[i] > 'Z' && s[i] < 'a') || (s[i] > 'z')) i++;
            else if((s[j]) < '0' || (s[j] > '9' && s[j] < 'A') || (s[j] > 'Z' && s[j] < 'a') || (s[j] > 'z')) j--;
            else if(tolower(s[i])!=tolower(s[j])) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
};
