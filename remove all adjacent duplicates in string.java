//remove all adjacent duplicates in string leetcode using stack
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/


class Solution {
    public String removeDuplicates(String S) {
        
         Stack<Character> result = new Stack();
         for (char c : S.toCharArray()) 
         {
             
            if (result.isEmpty()==false && result.peek() == c)
            {
                //remove
                result.pop();
            } 
             
             else
            {
               //add to stack
                result.push(c);
            }
             
        }
        
         StringBuilder str_result = new StringBuilder();
        
         while (result.isEmpty()==false)
         {
            str_result.append(result.pop()); 
         } 
        return str_result.reverse().toString();
 
        
    }
}
