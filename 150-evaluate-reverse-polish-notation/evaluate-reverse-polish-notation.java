class Solution {
    int Compute(int first,int second,String operator){
        if("+".equals(operator)){
            return first + second;
        }else if("-".equals(operator)){
            return first - second;
        }else if("*".equals(operator)){
            return first * second;
        }else if("/".equals(operator)){
            return first/second;
        }
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        for(String token : tokens){
            if("+".equals(token) || "-".equals(token) || "/".equals(token) || "*".equals(token)){
                int second = stack.pop();
                int first = stack.pop();
                int result = Compute(first,second,token);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}