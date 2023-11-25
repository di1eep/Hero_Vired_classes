def quicksort(arr):
    if len(arr) <= 1:
        return arr
    else:   
     pivot = arr[0]
     left = [i for i in arr[1:] if i <= pivot]
     right = [i for i in arr[1:] if i > pivot]
    return quicksort(left) + [pivot] + quicksort(right)

arr = [25,75,1,31,9,2,7,7]
sorted_arr = quicksort(arr)
print(sorted_arr)