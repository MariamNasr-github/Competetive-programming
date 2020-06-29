# quicksort hackerrank

def quickSort(arr):
    i = 0 #first 
    j = len(arr) - 1
    pivot = arr[0]
    while(i<j):

        while(arr[i]<=pivot):
            i +=1 #increment i 
        while(arr[j]>pivot):
            j -= 1 #decrement left
        if (i<j):
            arr[i],arr[j] = arr[j],arr[i] #swap to sort these 2 elements 
    arr[0],arr[j] = arr[j],arr[0]
    return arr
