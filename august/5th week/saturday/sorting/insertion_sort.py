def __insertionSort__(arr):
    for i in range(1, len(arr)):
        k = arr[i]
        j = i-1
        while(j >= 0 and k < arr[j]):
            arr[j+1] = arr[j]
            j -=1

        arr[j+1] = k

arr = [25,24,26,5,8]
print(arr)
__insertionSort__(arr)
print(arr)