

data = userInput()
writeFile(data)
# pip :
ReadFlag = input("Do you want to read the file")
if (ReadFlag == "y"):
    readFile()
    username = input("tell me the name of the user you want to know baout")
    userData(username)