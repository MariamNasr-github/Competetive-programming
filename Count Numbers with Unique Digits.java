
class Solution {
    
    public int countNumbersWithUniqueDigits(int n)
    {  
        if (n == 0) // no unique digits other than 0
        {
            return 1;
        }
        
        int result=10; // the main result when digits=1 is 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int Digits=9; //1,2,3,4,5,6,7,8,9
        
        for (int i = 2; i <= n && i <= 10; i++) // start from 2 because result for 1=10
        {

            Digits=Digits*(9 - i + 2); //math formula
            result=result+Digits; //add the result from the formula to the result we have
        }
        return result;   
    }
}
//EXAMPLE
/*
if digits = 4  -,-,-,-
 the first digit has 9 available digits
 the second one has 9-1=8 , exclude the digit of the first space to get unique digits
 the third one 9-2=7 , exclude first 2 digits but we can have 0 in the second digit
 9*(9-1)*(9-2+1)*(9-3+1)=


*/
