class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        boolean r = false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
                r = false;
            }
            else{
                if(!stack.empty()){
                    char t = stack.pop();
                    if(s.charAt(i) == ')'&& t == '(' ||s.charAt(i) == ']'&&t == '['||s.charAt(i) == '}'&& t == '{'){
                        r = true;
                        continue;
                    }
                    else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return (r == true)?true:false;
    }
}