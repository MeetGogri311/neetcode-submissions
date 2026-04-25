class Solution {
    private int[] freq;
    private int maxFreq;
    private char maxChar;
    private void findMaxFreq(){
        maxFreq = 0;
        for(int i=0;i<26;i++){
            if(maxFreq < freq[i]) {
                maxFreq = freq[i];
                maxChar = (char)((int)'A' + i);
            }
        }
    }
    public int characterReplacement(String s, int k) {
        freq = new int[26];
        int i,j=0, result = 0;
        maxFreq = 0;
        maxChar = '0';
        for(i=0;i<s.length();i++){
            freq[s.charAt(i) - 'A']++;
            if(freq[s.charAt(i)-'A'] > maxFreq){
                maxFreq = freq[s.charAt(i) - 'A'];
                maxChar = s.charAt(i);
            }
            while((i-j+1) - maxFreq > k){
                freq[s.charAt(j)-'A']--;
                if(s.charAt(j) == maxChar){
                    findMaxFreq();
                }
                j++;
            }
            result = Math.max(result, (i-j+1));
        }
        return result;
    }
}
