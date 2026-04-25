class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else if(stack.size() > 0){
                Character ch = stack.pop();
                if(s.charAt(i) == '}' && ch != '{') return false;
                if(s.charAt(i) == ')' && ch != '(') return false;
                if(s.charAt(i) == ']' && ch != '[') return false;
            } else{
                return false;
            }
        }
        return stack.size() == 0;
    }
}
