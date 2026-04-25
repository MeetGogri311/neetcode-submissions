class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int result = 0, tmp, leftSmaller;
        for(int i=0;i<heights.length;i++){
            while(!s.empty() && heights[s.peek()] > heights[i]){
                tmp = s.pop();
                leftSmaller = s.empty()? -1:s.peek();
                result = Math.max(result, (i-leftSmaller-1)*heights[tmp]);
            }
            s.push(i);
        }
        while(!s.empty()){
            tmp = s.pop();
            leftSmaller = s.empty()? -1:s.peek();
            result = Math.max(result, (heights.length-leftSmaller-1)*heights[tmp]);
        }
        return result;
    }
}
