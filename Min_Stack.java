package practice;

import java.util.Stack;

public class Min_Stack {
	private Stack<Integer> stack;
	private Stack<Integer> minstack;
    /** initialize your data structure here. */
    public Min_Stack() {
        stack = new Stack<Integer>();
	    minstack = new Stack<Integer>();
    }
    
    public void push(int x) {
        	stack.push(x);
	        if (minstack.isEmpty()){
	        	minstack.push(x);
	        }else{
	        	minstack.push(Math.min(x, minstack.peek()));
	        }
    }
    
    public void pop() {
         stack.pop();
         minstack.pop();
    }
    
    public int top() {
        return stack.lastElement();
    }
    
    public int getMin() {
         return minstack.lastElement();
    }
	

}
