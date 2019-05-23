/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    Map< Integer,Integer> mapita; 
    int minVal;
    int count;
    
    /** initialize your data structure here. */
    public MinStack() {
        Stack<Integer> s = new Stack<Integer>();
        Map<Integer, Integer> mapita = new HashMap<Integer,Integer>(); 
        int minVal = Integer.MAX_VALUE;
        int count = 0; 
    }
    
    public void push(int x) {
        
        s.push(x);
        
        if (x < minVal) {
            minVal = x;
            count = 1;
        }
        
        else {
            count++;
        }
    }
    
    public void pop() {
        
        if (s.peek() == minVal) {
            count--;
        }
        
        s.pop();
        
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
