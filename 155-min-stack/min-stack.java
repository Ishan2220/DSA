class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.size()==0){
            st.push(value);
            min.push(value);
        }
        else{
            if(min.peek()>value){
                st.push(value);
                min.push(value);
            }
            else{
                st.push(value);
                min.push(min.peek());
            } 
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */