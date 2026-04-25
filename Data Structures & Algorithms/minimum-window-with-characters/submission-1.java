class Solution {
    public String minWindow(String s, String t) {
        int[] currFreq, targetFreq;
        int i, j = 0, start = 0, length = Integer.MAX_VALUE, charsMatched = 0;
        currFreq = new int[60];
        targetFreq = new int[60];
        for(i=0;i<t.length();i++){
            targetFreq[t.charAt(i)-'A']++;
        }
        for(i=0;i<s.length();i++){
            currFreq[s.charAt(i)-'A']++;
            if(currFreq[s.charAt(i)-'A'] == targetFreq[s.charAt(i)-'A']){
                charsMatched += targetFreq[s.charAt(i)-'A'];
            }
            while(j<i){
                if(currFreq[s.charAt(j)-'A'] <= targetFreq[s.charAt(j)-'A']) break;
                currFreq[s.charAt(j)-'A']--;
                j++;
            }
            if(charsMatched == t.length() && length > (i-j+1)){
                length = (i-j+1);
                start = j;
            }
        }
        if(length == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+length);
    }
}
