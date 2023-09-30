numbers = [12,34,45,67,87,98]
for index in range(len(numbers)):
    print (numbers[index]),




matrix = [[12,34,45],[23,45,67],[34,56,78]]
for i in matrix:
    for j in i:
        print(j)



s = "KAYAK"
x = list(s)

newList = []
for index1 in range(len(x)-1, -1, -1):
   newList.append((x[index1]))

palandrome = x == newList


if(palandrome == True):
    print("it is a palandrome")
else:
    print("it is not a palandrome")



def fibonacci(n):
    a = 0
    b = 1

    if n > 0:
        for i in range(1, n):
            c = a + b
            a = b
            b = c
        return b
         
    elif n == 0:
        return 0
 
    elif n == 1:
        return b
    else:

     print(fibonacci(9))

