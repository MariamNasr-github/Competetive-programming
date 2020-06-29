
class Solution {
    
    public int binary_search(int[] data, int element)
    {
      int right = 0;
      int left = data.length- 1;

    while (right <= left)
    {
       int middle = (right + left)/2;
       
        if (data[middle] == element)
        {
            return middle;
        }
            
        else if (data[middle] > element)
        {
            left = middle - 1;
        }
            
        else
        {
             right = middle + 1;
        }
          
    }   
    return -1;
    }
        
    public int[] twoSum(int[] numbers, int target) 
    {
        int [] result= new int [2];
        for(int i=0;i<numbers.length;i++)
        {
            int j = binary_search(numbers,target-numbers[i]);
            
            for(j=i+1;j<numbers.length;j++)
            {
                if (numbers[i]+numbers[j]==target)
                {
                    int index1=i+1;
                    int index2=j+1;
                    result[0]=index1;
                    result[1]=index2;
                    break;
                    
                }
                
            }
            
        }
        return result;
    }
}
