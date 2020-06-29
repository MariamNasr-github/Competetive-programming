
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) 
    {
      return binarySearch(1,n);  //call the function
    }
    
    public int binarySearch(int low , int high)
    {
        int middle =low + (high-low)/2;
        
        if(low>=high)
        {
            return low;
        }
            
        if(isBadVersion(middle)) // if it is a bad version
        {
            return binarySearch(low, middle);// the n would be middle to take the first part of the array only
        }
        else
        {
            return binarySearch(middle+1,high); //if it is not a bad version increment the middle
        } 
    }
}
    
