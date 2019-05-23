/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author adria
 */
public class Solution {
    
    /**
     * Constructor of class solution
     * No parameters needed
     */
    public Solution(){}
    
    /**
     * 9. Palindrome Number
     *  Determine whether an integer is a palindrome. An integer is a palindrome
     *  when it reads the same backward as forward.
     *
     * Example 1:
     *  Input: 121 Output: true 
     * 
     * Example 2:
     *  Input: -121 
     *  Output: false 
     *  Explanation: From left to right, it reads -121. From right to left, it 
     *  becomes 121-. Therefore it is not a palindrome.
     * 
     * Example 3:
     *  Input: 10 
     *  Output: false 
     *  Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * 
     * @param x
     * @return flag
     */
    public boolean isPalindrome(int x) {
        
        String integer = Integer.toString(x);
        boolean flag = true;
        int j = integer.length()-1;
        
        for (int i=0; i<integer.length()-1; i++, j--) {
            
            if (integer.charAt(i) != integer.charAt(j))
                flag = false;
        }
        
        return flag;
    }
    
    /**
     * Debugger function
     */
    public void display() {
        System.out.println("Hey");
    }
}
