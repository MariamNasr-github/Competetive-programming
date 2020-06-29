
//squares of a sorted array
//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/

class Solution {
    public int[] sortedSquares(int[] arr) 
    {
        for (int s=0;s<arr.length;s++)
        {
            arr[s]=(arr[s])*arr[s]; //get the square of the num
            
        }
        
        for (int i=1;i<arr.length;i++){ //sort the squares of the numbers
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j=j-1;
            }
    }  
        return arr;
    }
}

