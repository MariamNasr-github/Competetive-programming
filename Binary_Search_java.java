
 public int binary_search(int[] data, int element)
    {
      int left= 0;
      int right = data.length- 1;

    while (left<= right)
    {
       int middle = left+(right-left)/2;       
        if (data[middle] == element)
        {
            return middle;
        }
            
        else if (data[middle] < element)
        {
            left = middle + 1;
        }
            
        else
        {
             right = middle - 1;
        }
          
    }   
    return -1;
    }
