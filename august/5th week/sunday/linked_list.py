# linked list

class node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head=None

    def insert(self,value):
        newnode=node(20)
        if self.head is None:
            self.head = newnode
        else:
           current=self.head
           while(current.next is not None):
               current = current.next
           current.next = newnode