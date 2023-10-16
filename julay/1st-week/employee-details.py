import csv

def getemployeedata():
    name = input("Enter the employee name :")
    department = input("Enter the employee department: ")
    salary = input("Enter the employee salary: ")
    return name, department,salary

def writeemployeedata(name, department, salary):
    file = open('employeedata.csv', 'a')
    if file.tell() == 0:
            file.write("name, department, salary\n")
    file.write(f"the employee name is {name} he is working in the {department} department, his salary is ₹{salary}\n")
    print("employee data saved succfully")

def getemployeedatafromCSV(employee_name):
    with open('employeedata.csv','r') as file:
        reader = csv.reader(file)
        header = next(reader)
        for row in reader:
            name, department, salary = row
            if name == employee_name:
                return name, department, salary
            return None

flag = "y"
while flag == "y":
    name, department, salary = getemployeedata()
    writeemployeedata(name, department, salary)

    flag = input("do you mant to enter other employee data (y/n):")\

print("you can the employee.csv for more information")

employee_name = input("do you want to check any employee details enter his name")
if employee_name:
    data = getemployeedatafromCSV(employee_name)
    if data:
        print(name)
        print(department)
        print(salary)
    else:
        print("employee not found")