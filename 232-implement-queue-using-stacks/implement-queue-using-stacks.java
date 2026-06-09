class MyQueue {
    Stack<Integer>inputStack;
    Stack<Integer>outputStack;
    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    public void shuffle(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
    }
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        shuffle();
        return outputStack.pop();
    }
    
    public int peek() {
        shuffle();
        return outputStack.peek();
    }
    
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */