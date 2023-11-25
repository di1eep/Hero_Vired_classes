from inputofSubject import inputofSubject


def takstudentInput(students):
    print("Executing function")
    student = {}
    subjectFlag = "y"
    while (subjectFlag == "y"):
        subjects = []
        subject = {}
        inputofSubject(subjects)
        subjectFlag = input("do you have any other subject data y/n")
    # calculatePercentageTotal(students)


# students = []
subjects = []
takstudentInput(subjects)
print(subjects)
