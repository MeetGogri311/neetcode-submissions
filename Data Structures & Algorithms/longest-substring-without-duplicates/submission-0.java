class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] present = new int[255];
        for(int i=0;i<255;i++){
            present[i] = -1;
        }
        int maxLength = 0, j = -1;
        for(int i=0;i<s.length();i++){
            j = Math.max(j, present[s.charAt(i)]);
            maxLength = Math.max(maxLength, i-j);
            present[s.charAt(i)] = i;
        }
        return maxLength;
    }
}
