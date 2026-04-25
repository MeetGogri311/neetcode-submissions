class Solution {
    public int maxArea(int[] heights) {
        int i = 0,j = heights.length-1, result = 0;
        while(i<j){
            if(heights[i] > heights[j]){
                result = Math.max(result, (j-i)*heights[j]);
                j--;
            } else{
                result = Math.max(result, (j-i)*heights[i]);
                i++;
            }
        }
        return result;
    }
}
