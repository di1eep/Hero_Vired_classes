
stackList = []
stackList.append(15)
stackList.append(20)

#add an element
def stackAddElement(element):
    stackList.append(element)

#retrieveing an element
def stackRetrieveElement():
    return stackList[len(stackList)-1]

#search and delete an element

#need to search the element 


stackAddElement(stackList, 25)
stackAddElement(stackList, 35)
stackAddElement(stackList, 45)
stackAddElement(stackList, 50)
stackAddElement(stackList, 20)
print(stackList)
item=stackRetrieveElement(stackList)
