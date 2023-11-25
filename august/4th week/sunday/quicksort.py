# def quicksort(arr):
#     if len(arr) <= 1:
#         return arr
#     else:
#         pivot = arr[0]
#         less = [x for x in arr[1:] if x <= pivot]
#         greater = [x for x in arr[1:] if x > pivot]
#         return quicksort(less) + [pivot] + quicksort(greater)


# # Example usage:
# my_list = [3, 6, 8, 10, 1, 2, 1]
# sorted_list = quicksort(my_list)
# print(sorted_list)


# another method

def quicksort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[0]
    left = []
    right = []

    for num in arr[1:]:
        if num < pivot:
            left.append(num)
        else:
            right.append(num)

    return quicksort(left) + [pivot] + quicksort(right)


# Example usage
input_array = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
sorted_array = quicksort(input_array)
print(sorted_array)
