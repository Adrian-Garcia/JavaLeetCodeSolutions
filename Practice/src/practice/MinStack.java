/**
 * 155. Min Stack 
 *  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *      push(x) -- Push element x onto stack.
 *      pop() -- Removes the element on top of the stack.
 *      top() -- Get the top element.
 *      getMin() -- Retrieve the minimum element in the stack.
 * 
 * Example:
 *  MinStack minStack = new MinStack();
 *  minStack.push(-2);
 *  minStack.push(0);
 *  minStack.push(-3);
 *  minStack.getMin();   --> Returns -3.
 *  minStack.pop();
 *  minStack.top();      --> Returns 0. 
 *  minStack.getMin();   --> Returns -2.
*/
package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author adria
 */
public class MinStack {

    Stack<Integer> s = new Stack<Integer>();
    int minVal;
    
    /** initialize your data structure here. */
    public MinStack() {
        Stack<Integer> s = new Stack<Integer>();
        int minVal = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        
        if (x <= minVal) {
            
            s.push(minVal);
            minVal = x;
        }    
        
        s.push(x);
    }
    
    public void pop() {
        
        if (s.pop() == minVal)
            minVal = s.pop();
        
        if (s.isEmpty())
            minVal = Integer.MIN_VALUE;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minVal;
    }
}