class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n==0) return false;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if((ch==')' || ch=='}' || ch==']') && st.size()==0){
                return false;
            }
            if(ch == ')' && st.size()>0){
                if(ch==')' && st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            if(ch == '}' && st.size()>0){
                if(ch=='}' && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            if(ch == ']' && st.size()>0){
                if(ch==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
        }
        if(st.size()>0){
            return false;
        }
        else return true;
    }
}