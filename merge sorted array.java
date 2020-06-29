

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
      
        int [] merged= new  int[m+n];
        
        int i = 0;
        int j = 0;
        int merged_counter = 0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if (nums1[i] <nums2[j])
        {
            merged[merged_counter] = nums1[i];
            i++;
        }
        else
        {
            merged[merged_counter] = nums2[j];
            j++;
        }
            
        merged_counter++;
            
        }
        
        while (i < nums1.length)
        {
            merged[merged_counter] = nums1[i];
            i++;
            merged_counter++;
        }

        while (j < nums2.length)
        {
            merged[merged_counter] = nums2[j];
            j++;
            merged_counter++;
        }

    //return merged;
         
    }
}
