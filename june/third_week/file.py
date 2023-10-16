def readFile():
  fileObject = open("Book1.csv",'r')
  data = fileObject.readline()
  data = fileObject.read()
  print(data)
  fileObject.close()

def writeFile():
  fileObject = open("file1.csv", "x")
  data = "Dileep, 22, 33, 44, 44 \nSanjoy, 35,34,56,78,80"
  fileObject.write(data)

writeFile()

def createFile():
  fileObject = open("Book1.csv", "w")
  data = "Dileep, 22, 33, 44, 44 \nSanjoy, 35,34,56,78,80"
  fileObject.write(data)

createFile()