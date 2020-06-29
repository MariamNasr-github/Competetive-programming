
//sort array by parity leetcode
//https://leetcode.com/problems/sort-array-by-parity/submissions/

class Solution {
    public int[] sortArrayByParity(int[] A)
    {
        int [] even= new int [A.length];
        int [] odd= new int [A.length];
        int even_counter=0;
        int odd_counter=0;
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                even[even_counter]=A[i];
                even_counter++;   
            }
            else
            {
                odd[odd_counter]=A[i];
                odd_counter++;
            }
        }
        
        int[]merged=new int[A.length];
        int counter=0;
        for(int j=0;j<even_counter;j++){
            merged[j]=even[j];
            counter++;
        }
        for(int m=0;m<odd_counter;m++){
            merged[counter]=odd[m];
            counter++;
        }
        return merged;
        
    }
}

