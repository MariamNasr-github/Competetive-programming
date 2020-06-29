//HackerRank : Sorting: Bubble Sort

//link to the problem: https://www.hackerrank.com/challenges/ctci-bubble-sort/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    public static int countSwaps(int[] a,int n) {
        int numSwaps=0;
        for (int i = 0; i < n; i++) {
    
            for (int j = 0; j < n - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    //swap(a[j], a[j + 1]);
                    numSwaps++;
                }
        }
        
        
             
}
    return numSwaps;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int numSwaps=countSwaps(a,n);

        scanner.close();
        System.out.println("Array is sorted in "+numSwaps+ " swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}

