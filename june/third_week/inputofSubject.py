def inputofSubject(subjects):
    subject = {}
    subjectName = (input("Please enter the name of the subject"))
    marks = int(input("enter the marks for the subjec"))
    subject["name"] = subjectName
    subject["marks"] = marks
    subjects.append(subject)


# subjects = []
# inputofSubject(subjects)
# print(subjects)
