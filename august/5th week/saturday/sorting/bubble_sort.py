# Bubble sort 

# loop starts
# 1)comparing the elements 
# 2)interchanging from small to large(ascending order)
# loop ends afetr assending order

def __bubblesort__(arr):
    length = len(arr)
    for i in range(length):     # loop through the length
        for j in range(0, length - i -1):   # loop through the elements in the array 
            if arr[j] > arr[j+1]:           # comparing with only the elements 
              arr[j] , arr[j+1] = arr[j+1] , arr[j]
            

arr = [4,2,60,13,15,1]

__bubblesort__(arr)
print(arr)
