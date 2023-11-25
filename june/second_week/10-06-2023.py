# lists collecton of variable and strings and numbers
# non-premative data(list) as it orizionated from variables 

# newList = [23, 45, 65, 80, 95,"Sohil"]
# newList.append(75)
# print(newList)



studentNames = ["Sohail" , "Sanjoy" , "Neeraj"];
scienceMarks = [30 , 40 , 50];
mathsMarks = [70, 60 , 90];
englishMarks = [80 , 90 , 70];

for i in range(len(studentNames)) : 
    
        print(studentNames[i] , "has scored " , scienceMarks[i] , "in science");
        print(studentNames[i] , "has scored " , mathsMarks[i] , "in science");
        print(studentNames[i] , "has scored " , englishMarks[i] , "in science");


for index in range (len(studentNames)) : 
    tempMaxScore = studentPercentages[index];
    if tempMaxScore > maxPercentScored :
        maxPercentScored = tempMaxScore
        maxScorrerName = studentNames[index];

Sanjoy Paul  to  Everyone 15:39
studentNames = []
mathMarksList = []
scienceMarksList = []
englishMarksList = []
totalMarksList = []
percentageMarksList = []

flag = "y"
while (flag == "y"):
    studentName = input("Please enter the student Name:")
    studentNames.append(studentName)
# validation logic
    mathMarks = int(input("Please enter the marks for Math"))
    mathMarksList.append(mathMarks)
    scienceMarks = int(input(" Enter the marks for Science"))
    scienceMarksList.append(scienceMarks)
    englishMarks = int(input(" Enter the marks for English"))
    englishMarksList.append(englishMarks)

# Processing the marks
    totalMarks = mathMarks+scienceMarks+englishMarks
    totalMarksList.append(totalMarks)
    print(" The total marks of the student would be ", totalMarks)

# percentage of the total marks
    percentageMarks = (totalMarks/300)*100
    percentageMarksList.append(percentageMarks)
#####
# if statement
    if (percentageMarks < 30):
        print(" The student have failed")
        print(" grade : F")
    elif (percentageMarks < 60):

        print("Grade D")

    elif (percentageMarks < 80):

        print("grade A")
    else:
        print("grade E")
    flag = input("do you have any other student data y/n")

print(studentNames)
print(totalMarksList)