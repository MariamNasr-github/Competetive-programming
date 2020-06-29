//Binary number with alternating bit leetcode
//https://leetcode.com/problems/binary-number-with-alternating-bits/submissions/

class Solution {
    public boolean hasAlternatingBits(int n) {
        
        
        int last=n%2; // even-->0 , odd-->1 (least significant  bit)
        System.out.println("last "+ last);
        n>>=1; //shift to remove the last one
        System.out.println("n" + n);
        while(n>0){
            int current=n%2; //to compare last with current
            System.out.println("current"+current);
            if(current==last){ //if they are equal then not alternating
                return false;
            }
            
            last=current; 
            System.out.println("last "+ last);
            n>>=1;
            System.out.println("n" + n);
        }
        return true;
        
    }
}
