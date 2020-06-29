//single number leetcode
//https://leetcode.com/problems/single-number/submissions/

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        
        new=[]
        for i in nums:
            if i in new:
                new.remove(i)
            else:
                new.append(i)
        return new.pop()        
