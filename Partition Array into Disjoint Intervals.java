

class Solution {
    public int partitionDisjoint(int[] A) 
    {
        int current_max=A[0];
        int previous_max=A[0];
        int length_counter=0;
        if(A.length==2)
        {
            return 1;
        }
        
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            {
                length_counter++;
            }
            
            else if((A[i]>current_max))
            {
                current_max=A[i];
            }
            
            else if(A[i]<current_max && A[i]>previous_max)
            {
                previous_max=current_max;
                //length_counter++;   
            }
            
            else if(A[i]<=current_max && A[i]<=previous_max)
            {
                previous_max=current_max;
                length_counter++;   
            }  
        }
        
        return length_counter; 
    }
}

