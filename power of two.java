
//powers of two leetcode
//https://leetcode.com/problems/power-of-two/submissions/

class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        while (n%2 == 0)
        {
            n=n/2;
            if (n <= 0)
            {
            return false;
            } 
            
        } 
        return n == 1;
        
        
        
    }
}
