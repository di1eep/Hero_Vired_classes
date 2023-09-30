queueList = []

def addElementQueue(listname, element):
    listname.append(element)

def retrieveElementQueue(listname):
    item = listname[len(listname) - 1]
    listname.pop(0)
    return item

addElementQueue(queueList, 15)
addElementQueue(queueList, 25)
addElementQueue(queueList, 35)
addElementQueue(queueList, 25)
addElementQueue(queueList, 45)
addElementQueue(queueList, 55)
addElementQueue(queueList, 65)
print(queueList)
item = retrieveElementQueue(queueList)
print(item)
print(queueList)


def searchandRetrieve(queueName, element):
    newqueue = []
    flag = 0
    for index in range(len(queueName)-1):
        if (queueName[index] == element):
            flag = 1
            retrieveElementQueue(queueList)
            return index

        else:
            if (flag == 0):
                addElementQueue(newqueue, queueName[index])
                print("newqueue", newqueue)

                retrieveElementQueue(queueList)
    queuName = queueName + newqueue

index = searchandRetrieve(queueList, 25)
print(queueList)
print(index)