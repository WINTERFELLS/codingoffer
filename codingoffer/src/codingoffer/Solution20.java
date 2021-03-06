package codingoffer;

import java.util.Stack;

/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Solution20 {
	Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    
    public void push(int node) {
        stack.push(node);
        if(min.isEmpty()){
            min.push(node);
        }else if(node < min.peek()){
            min.push(node);
        }
    }
    
    public void pop() {
        if(min.peek() == stack.peek()){
            min.pop();
        }
        stack.pop();
        return;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min.peek();
    }
}
