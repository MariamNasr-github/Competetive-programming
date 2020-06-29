//valid parentheses leet code
//https://leetcode.com/problems/valid-parentheses/submissions/


class Solution {
    public boolean isValid(String s) 
    {
 
       Stack<Character> result = new Stack(); 
        for(int i = 0; i<s.length(); i++) 
        {
            
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                result.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && !result.empty() && result.peek()=='(' ){
                result.pop();
            }
             else if(s.charAt(i)=='}' && !result.empty() && result.peek()=='{' ){
                result.pop();
            }
             else if(s.charAt(i)==']' && !result.empty() && result.peek()=='[' ){
                result.pop();
            }
            
            else{
                return false;
            }
            
        }
        
          return result.empty();
          
        
    }
}
    
