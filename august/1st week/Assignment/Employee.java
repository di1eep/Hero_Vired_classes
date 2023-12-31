import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Employee {
    public static String fileName = "./LiveSESSION/employees.csv";
    public static String header = "Name,Age,Salary,Designation,Gender,Contact Information,Department,Date of Joining,Performance Ratings";
    private String name;
    private int age;
    private double salary;
    private String designation;
    private String gender;
    private String contactInfo;
    private String department;
    private String dateOfJoining;
    private int performanceRating;

    // Constructor
    public Employee(String name, int age, double salary, String designation, String gender,
                    String contactInfo, String department, String dateOfJoining, int performanceRating) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.performanceRating = performanceRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add new employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Find employee with highest salary");
            System.out.println("4. Find employee with lowest salary");
            System.out.println("5. Find youngest employee");
            System.out.println("6. Find oldest employee");
            System.out.println("7. Find employees within age range");
            System.out.println("8. Calculate total salary of all employees");
            System.out.println("9. Calculate average age of employees");
            System.out.println("10. Calculate average salary of employees");
            System.out.println("11. Find employees above salary threshold");
            System.out.println("12. Update employee age");
            System.out.println("13. Update employee name");
            System.out.println("14. Remove employee by name");
            System.out.println("15. Remove employee by index");
            System.out.println("16. Sort employees by age");
            System.out.println("17. Sort employees by salary");
            System.out.println("18. Search employees by name");
            System.out.println("19. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addNewEmployee(fileName, scanner);
                    break;
                case 2:
                    displayAllEmployees(fileName);
                    break;
                case 3:
                    findEmployeeWithHighestSalary(fileName);
                    break;
                case 4:
                    findEmployeeWithLowestSalary(fileName);
                    break;
                case 5:
                    findYoungestEmployee(fileName);
                    break;
                case 6:
                    findOldestEmployee(fileName);
                    break;
                case 7:
                    findEmployeesWithinAgeRange(fileName, scanner);
                    break;
                case 8:
                    calculateTotalSalary(fileName);
                    break;
                case 9:
                    calculateAverageAge(fileName);
                    break;
                case 10:
                    calculateAverageSalary(fileName);
                    break;
                case 11:
                    findEmployeesAboveSalaryThreshold(fileName, scanner);
                    break;
                case 12:
                    updateEmployeeAge(fileName, scanner);
                    break;
                case 13:
                    updateEmployeeName(fileName, scanner);
                    break;
                case 14:
                    removeEmployeeByName(fileName, scanner);
                    break;
                case 15:
                    removeEmployeeByIndex(fileName, scanner);
                    break;
                case 16:
                    sortEmployeesByAge(fileName);
                    break;
                case 17:
                    sortEmployeesBySalary(fileName);
                    break;
                case 18:
                    searchEmployeesByName(fileName, scanner);
                    break;
                case 19:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
    }

    public static void addNewEmployee(String fileName, Scanner scanner) {
        System.out.println("\n=== Add New Employee ===");

        try {
            // Open the CSV file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            // Check if the file is empty, and if so, write the header first
            File file = new File(fileName);
            if (file.length() == 0) {
                writer.write(header);
                writer.newLine();
            }

            // Get employee details from the user
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            int age;
            while (true) {
                try {
                    System.out.print("Enter Employee Age: ");
                    age = scanner.nextInt();
                    if (age < 14) {
                        throw new IllegalArgumentException("Age should be equal or greater than 14.");
                    }
                    break; // If the age is valid, break the loop
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage() + " Please try again.");
                }
            }

            double salary;
            while (true) {
                try {
                    System.out.print("Enter Employee Salary: ");
                    salary = scanner.nextDouble();
                    if (salary < 0) {
                        throw new IllegalArgumentException("Salary should be a positive number.");
                    }
                    break; // If the salary is valid, break the loop
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage() + " Please try again.");
                }
            }
            scanner.nextLine(); // Consume the newline character after reading double

            System.out.print("Enter Employee Designation: ");
            String designation = scanner.nextLine();

            String gender;
            while (true) {
                try {
                    System.out.print("Enter Employee Gender (Male, Female, Others): ");
                    gender = scanner.nextLine();
                    if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Others")) {
                        throw new IllegalArgumentException("Invalid gender entered. Please select from Male, Female, or Others.");
                    }
                    break; // If the gender is valid, break the loop
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage() + " Please try again.");
                }
            }

            String contactInfo;
            while (true) {
                try {
                    System.out.print("Enter Employee Contact Information (10 digit mobile number): ");
                    contactInfo = scanner.nextLine();
                    if (!contactInfo.matches("\\d{10}")) {
                        throw new IllegalArgumentException("Invalid contact information entered. Please enter a 10 digit mobile number.");
                    }
                    break; // If the contact info is valid, break the loop
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage() + " Please try again.");
                }
            }

            System.out.print("Enter Employee Department: ");
            String department = scanner.nextLine();

            String dateOfJoining;
            while (true) {
                try {
                    System.out.print("Enter Employee Date of Joining (yyyy-MM-dd): ");
                    dateOfJoining = scanner.nextLine();
                    LocalDate joiningDate = LocalDate.parse(dateOfJoining, DateTimeFormatter.ISO_LOCAL_DATE);
                    if (joiningDate.isAfter(LocalDate.now())) {
                        throw new IllegalArgumentException("Date of joining cannot be a future date.");
                    }
                    break; // If the date of joining is valid, break the loop
                } catch (DateTimeParseException e) {
                    System.err.println("Invalid date format. Please enter the date in yyyy-MM-dd format. Please try again.");
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage() + " Please try again.");
                }
            }

            int performanceRating;
            while (true) {
                try {
                    System.out.print("Enter Employee Performance Rating: ");
                    performanceRating = scanner.nextInt();
                    // Here, you might want to add validation for performance rating as well
                    break; // If the performance rating is valid, break the loop
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage() + " Please try again.");
                }
            }
            scanner.nextLine(); // Consume the newline character after reading int

            // Create an Employee object with the collected details
            Employee newEmployee = new Employee(name, age, salary, designation, gender, contactInfo, department, dateOfJoining, performanceRating);

            // Write the employee details to the CSV file
            writer.write(newEmployee.getName() + "," + newEmployee.getAge() + "," + newEmployee.getSalary() + ","
                    + newEmployee.getDesignation() + "," + newEmployee.getGender() + "," + newEmployee.getContactInfo()
                    + "," + newEmployee.getDepartment() + "," + newEmployee.getDateOfJoining() + ","
                    + newEmployee.getPerformanceRating());
            writer.newLine();

            // Close the writer
            writer.close();

            System.out.println("Employee added successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while adding the employee: " + e.getMessage());
        }
    }

    public static void displayAllEmployees(String fileName) {
        System.out.println("\n=== Display All Employees ===");
        List<Employee> employees = readEmployeesFromFile(fileName);

        // Display employees
        displayEmployeesTable(employees);
    }

    public static void findEmployeeWithHighestSalary(String fileName) {
        System.out.println("\n=== Find Employee with Highest Salary ===");
        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line (to skip it)
            reader.readLine();

            // Initialize variables to store the highest salary and the employee with that salary
            double highestSalary = Double.MIN_VALUE;
            String employeeWithHighestSalary = "";

            // Read and compare each employee's salary to find the highest salary
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                double salary = Double.parseDouble(employeeData[2]); // Salary is at index 2 in the CSV file
                if (salary > highestSalary) {
                    highestSalary = salary;
                    employeeWithHighestSalary = employeeData[0]; // Employee name is at index 0 in the CSV file
                }
            }

            // Close the reader
            reader.close();

            if (employeeWithHighestSalary.isEmpty()) {
                System.out.println("No employees found in the database.");
            } else {
                // Display the employee with the highest salary
                System.out.println("Employee with Highest Salary:");
                System.out.println("Name: " + employeeWithHighestSalary);
                System.out.println("Salary: " + highestSalary);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing salary data: " + e.getMessage());
        }
    }

    public static void findEmployeeWithLowestSalary(String fileName) {
        System.out.println("\n=== Find Employee with Lowest Salary ===");
        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line and skip it
            String line = reader.readLine();

            // Initialize variables to track the employee with the lowest salary
            String lowestSalaryEmployeeName = null;
            double lowestSalary = Double.MAX_VALUE;

            // Read and process each employee's details
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String name = employeeData[0];
                double salary = Double.parseDouble(employeeData[2]);

                // Check if the current employee has the lowest salary so far
                if (salary < lowestSalary) {
                    lowestSalary = salary;
                    lowestSalaryEmployeeName = name;
                }
            }

            // Close the reader
            reader.close();

            // Display the employee with the lowest salary
            if (lowestSalaryEmployeeName != null) {
                System.out.println("Employee with Lowest Salary:");
                System.out.println("Name: " + lowestSalaryEmployeeName);
                System.out.println("Salary: " + lowestSalary);
            } else {
                System.out.println("No employees found in the database.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error occurred while parsing salary: " + e.getMessage());
        }
    }

    public static void findYoungestEmployee(String fileName) {
        System.out.println("\n=== Find Youngest Employee ===");
        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line (discard it as we don't need it for this operation)
            reader.readLine();

            int youngestAge = Integer.MAX_VALUE;
            String youngestEmployee = null;

            // Read each employee's details and find the youngest employee
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                int age = Integer.parseInt(employeeData[1]);

                if (age < youngestAge) {
                    youngestAge = age;
                    youngestEmployee = employeeData[0];
                }
            }

            // Close the reader
            reader.close();

            if (youngestEmployee != null) {
                System.out.println("Youngest Employee: " + youngestEmployee);
                System.out.println("Age: " + youngestAge);
            } else {
                System.out.println("No employees found in the database.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing employee age: " + e.getMessage());
        }
    }

    public static void findOldestEmployee(String fileName) {
        System.out.println("\n=== Find Oldest Employee ===");
        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line and skip it (since we don't need it for finding the oldest employee)
            String line = reader.readLine();

            // Variables to store information about the oldest employee
            String oldestEmployeeName = "";
            int oldestEmployeeAge = Integer.MIN_VALUE; // Initialize to a large value

            // Read and process each employee's details
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String name = employeeData[0];
                int age = Integer.parseInt(employeeData[1]);

                // Check if the current employee is older than the previous oldest employee
                if (age > oldestEmployeeAge) {
                    oldestEmployeeName = name;
                    oldestEmployeeAge = age;
                }
            }

            // Close the reader
            reader.close();

            // Display the oldest employee's information
            if (!oldestEmployeeName.isEmpty()) {
                System.out.println("Oldest Employee Name: " + oldestEmployeeName);
                System.out.println("Oldest Employee Age: " + oldestEmployeeAge);
            } else {
                System.out.println("No employees found in the database.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void findEmployeesWithinAgeRange(String fileName, Scanner scanner) {
        System.out.println("\n=== Find Employees Within Age Range ===");
        try {
            // Get the age range from the user
            System.out.print("Enter the minimum age: ");
            int minAge = scanner.nextInt();
            System.out.print("Enter the maximum age: ");
            int maxAge = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading int

            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line and display it
            String line = reader.readLine();
            if (line == null) {
                System.out.println("No employees found in the database.");
                reader.close();
                return;
            }
            System.out.println(formatTableRow(header.split(",")));

            // Read and display employees within the specified age range
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                int age = Integer.parseInt(employeeData[1]);
                if (age >= minAge && age <= maxAge) {
                    System.out.println(formatTableRow(employeeData));
                }
            }

            // Close the reader
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void calculateTotalSalary(String fileName) {
        System.out.println("\n=== Calculate Total Salary of All Employees ===");
        double totalSalary = 0.0;

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line (if exists) to skip it
            String line = reader.readLine();

            // Read and sum the salary of each employee
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                // Assuming the salary is the third attribute in the CSV file (index 2)
                double salary = Double.parseDouble(employeeData[2]);
                totalSalary += salary;
            }

            // Close the reader
            reader.close();

            // Display the total salary
            System.out.println("Total Salary of All Employees: " + totalSalary);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid salary format in the CSV file.");
        }
    }

    public static void calculateAverageAge(String fileName) {
        System.out.println("\n=== Calculate Average Age of Employees ===");
        int totalAge = 0;
        int totalEmployees = 0;

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Skip the header line
            String line = reader.readLine();

            // Read and sum up the age of each employee
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                int age = Integer.parseInt(employeeData[1]);
                totalAge += age;
                totalEmployees++;
            }

            // Close the reader
            reader.close();

            if (totalEmployees == 0) {
                System.out.println("No employees found in the database.");
            } else {
                // Calculate and display the average age
                double averageAge = (double) totalAge / totalEmployees;
                System.out.printf("Average Age of Employees: %.2f%n", averageAge);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error occurred while parsing age: " + e.getMessage());
        }
    }

    public static void calculateAverageSalary(String fileName) {
        System.out.println("\n=== Calculate Average Salary of Employees ===");
        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line (and skip it) as we don't need it for the calculation
            reader.readLine();

            int totalEmployees = 0;
            double totalSalary = 0.0;

            // Read each employee's details and calculate total salary and count of employees
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                if (employeeData.length >= 3) {
                    double salary = Double.parseDouble(employeeData[2]);
                    totalSalary += salary;
                    totalEmployees++;
                }
            }

            // Close the reader
            reader.close();

            if (totalEmployees == 0) {
                System.out.println("No employees found in the database.");
            } else {
                double averageSalary = totalSalary / totalEmployees;
                System.out.printf("Average Salary of Employees: $%.2f%n", averageSalary);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing salary data: " + e.getMessage());
        }
    }

    public static void findEmployeesAboveSalaryThreshold(String fileName, Scanner scanner) {
        System.out.println("\n=== Find Employees Above Salary Threshold ===");
        System.out.print("Enter the salary threshold: ");
        double threshold = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character after reading double

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line (ignore it for this operation)
            reader.readLine();

            // Keep track of whether any employees above the threshold were found
            boolean employeesFound = false;

            // Read and display employees with salaries above the threshold
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                double salary = Double.parseDouble(employeeData[2]);
                if (salary > threshold) {
                    // Print the header only once if there are employees above the threshold
                    if (!employeesFound) {
                        System.out.println(formatTableRow(header.split(",")));
                        employeesFound = true;
                    }
                    System.out.println(formatTableRow(employeeData));
                }
            }

            // Close the reader
            reader.close();

            if (!employeesFound) {
                System.out.println("No employees found with salaries above the threshold.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void updateEmployeeAge(String fileName, Scanner scanner) {
        System.out.println("\n=== Update Employee Age ===");
        // Display all employees before asking for input to show their current ages
        displayAllEmployees(fileName);

        System.out.print("Enter the name of the employee whose age you want to update: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter the new age for " + employeeName + ": ");
        int newAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading int

        // Read all employees from the CSV file into a list for updating
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Skip the header line
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                Employee employee = new Employee(
                    employeeData[0],
                    Integer.parseInt(employeeData[1]),
                    Double.parseDouble(employeeData[2]),
                    employeeData[3],
                    employeeData[4],
                    employeeData[5],
                    employeeData[6],
                    employeeData[7],
                    Integer.parseInt(employeeData[8])
                );
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Find the employee in the list by name and update the age
        boolean employeeFound = false;
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(employeeName)) {
                employee.setAge(newAge);
                employeeFound = true;
                break;
            }
        }

        // If the employee was found and updated, rewrite the entire file with the updated data
        if (employeeFound) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                // Write the header
                writer.write(header);
                writer.newLine();

                // Write each updated employee to the file
                for (Employee employee : employees) {
                    writer.write(employee.getName() + ","
                            + employee.getAge() + ","
                            + employee.getSalary() + ","
                            + employee.getDesignation() + ","
                            + employee.getGender() + ","
                            + employee.getContactInfo() + ","
                            + employee.getDepartment() + ","
                            + employee.getDateOfJoining() + ","
                            + employee.getPerformanceRating());
                    writer.newLine();
                }

                System.out.println("Employee age updated successfully.");
            } catch (IOException e) {
                System.err.println("Error occurred while writing to the file: " + e.getMessage());
            }
        } else {
            System.out.println("Employee not found. Age not updated.");
        }
    }

    public static void updateEmployeeName(String fileName, Scanner scanner) {
        System.out.println("\n=== Update Employee Name ===");
        // Prompt the user for the employee's current name and new name
        System.out.print("Enter the current name of the employee: ");
        String currentName = scanner.nextLine();
        System.out.print("Enter the new name of the employee: ");
        String newName = scanner.nextLine();

        try {
            // Open the CSV file for reading and writing
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".tmp", true));

            // Read the header line and write it to the temporary file
            String line = reader.readLine();
            writer.write(line);
            writer.newLine();

            boolean employeeFound = false;
            // Read and update each employee's details
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String name = employeeData[0];

                // Check if the current line contains the employee to be updated
                if (name.equalsIgnoreCase(currentName)) {
                    // Update the name to the new name
                    employeeData[0] = newName;
                    employeeFound = true;
                }

                // Write the updated or unmodified employee details to the temporary file
                writer.write(String.join(",", employeeData));
                writer.newLine();
            }

            // Close the reader and writer
            reader.close();
            writer.close();

            // Rename the temporary file to the original file
            File oldFile = new File(fileName);
            File newFile = new File(fileName + ".tmp");
            if (oldFile.delete()) {
                newFile.renameTo(new File(fileName));
            } else {
                throw new IOException("Failed to update employee name.");
            }

            if (employeeFound) {
                System.out.println("Employee name updated successfully.");
            } else {
                System.out.println("Employee not found with the given name.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while updating the employee name: " + e.getMessage());
        }
    }

    public static void removeEmployeeByName(String fileName, Scanner scanner) {
        System.out.println("\n=== Remove Employee by Name ===");
        System.out.print("Enter the name of the employee to remove: ");
        String nameToRemove = scanner.nextLine();

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> lines = new ArrayList<>();

            // Read the header line and add it to the list of lines
            String headerLine = reader.readLine();
            if (headerLine == null) {
                System.out.println("No employees found in the database.");
                reader.close();
                return;
            }
            lines.add(headerLine);

            // Read each line and check if the name matches the name to remove
            String line;
            boolean employeeRemoved = false;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String employeeName = employeeData[0].trim();

                // If the employee name matches the name to remove, skip adding this line to the list
                if (!employeeName.equalsIgnoreCase(nameToRemove)) {
                    lines.add(line);
                } else {
                    employeeRemoved = true;
                }
            }

            // Close the reader
            reader.close();

            // Write the updated data back to the CSV file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();

            if (employeeRemoved) {
                System.out.println("Employee '" + nameToRemove + "' removed successfully.");
            } else {
                System.out.println("Employee '" + nameToRemove + "' not found in the database.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading/writing the file: " + e.getMessage());
        }
    }

    public static void removeEmployeeByIndex(String fileName, Scanner scanner) {
        System.out.println("\n=== Remove Employee by Index ===");
        // Display all employees first to show the available indices
        displayAllEmployees(fileName);

        System.out.print("Enter the index of the employee to remove: ");
        int indexToRemove = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading int

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Create a temporary list to hold all employee lines except the one to be removed
            List<String> tempLines = new ArrayList<>();

            // Read the header line and add it to the temporary list
            String headerLine = reader.readLine();
            tempLines.add(headerLine);

            // Read and process each employee's details
            String line;
            int currentIndex = 0;
            while ((line = reader.readLine()) != null) {
                if (currentIndex != indexToRemove) {
                    tempLines.add(line);
                }
                currentIndex++;
            }

            // Close the reader
            reader.close();

            // Write the updated employee list (without the removed employee) back to the CSV file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String tempLine : tempLines) {
                writer.write(tempLine);
                writer.newLine();
            }
            writer.close();

            System.out.println("Employee at index " + indexToRemove + " has been removed.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading/writing the file: " + e.getMessage());
        }
    }

    public static void sortEmployeesByAge(String fileName) {
        System.out.println("\n=== Sort Employees by Age ===");
        List<Employee> employees = readEmployeesFromFile(fileName);

        // Sort employees by age using a custom comparator
        employees.sort(Comparator.comparingInt(Employee::getAge));

        // Display sorted employees
        displayEmployeesTable(employees);
    }

    public static void sortEmployeesBySalary(String fileName) {
        System.out.println("\n=== Sort Employees by Salary ===");
        List<Employee> employees = readEmployeesFromFile(fileName);

        if (employees.isEmpty()) {
            System.out.println("No employees found in the database.");
            return;
        }

        // Sort employees based on salary in ascending order
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));

        // Display employees in sorted order
        displayEmployeesTable(employees);
    }

    public static void searchEmployeesByName(String fileName, Scanner scanner) {
        System.out.println("\n=== Search Employees by Name ===");
        System.out.print("Enter the name to search for: ");
        String searchName = scanner.nextLine();

        List<String[]> searchResults = new ArrayList<>();

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read the header line (and skip it)
            reader.readLine();

            // Read and find matching employees by name
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                if (employeeData[0].equalsIgnoreCase(searchName)) {
                    searchResults.add(employeeData);
                }
            }

            // Close the reader
            reader.close();

            // Display search results
            if (searchResults.isEmpty()) {
                System.out.println("No matching employees found.");
            } else {
                // Display the header first
                System.out.println(formatTableRow(header.split(",")));
                for (String[] employeeData : searchResults) {
                    System.out.println(formatTableRow(employeeData));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }
    }

    private static String formatTableRow(String[] rowData) {
        StringBuilder sb = new StringBuilder();
        for (String data : rowData) {
            // Align each column with a width of 20 characters
            sb.append(String.format("%-20s", data));
        }
        return sb.toString();
    }

    private static List<Employee> readEmployeesFromFile(String fileName) {
        List<Employee> employees = new ArrayList<>();

        try {
            // Open the CSV file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Skip the header line
            reader.readLine();

            // Read and parse each employee's details
            String line;
            while ((line = reader.readLine()) != null) {
                String[] employeeData = line.split(",");
                String name = employeeData[0];
                int age = Integer.parseInt(employeeData[1]);
                double salary = Double.parseDouble(employeeData[2]);
                String designation = employeeData[3];
                String gender = employeeData[4];
                String contactInfo = employeeData[5];
                String department = employeeData[6];
                String dateOfJoining = employeeData[7];
                int performanceRating = Integer.parseInt(employeeData[8]);

                // Create an Employee object and add it to the list
                Employee employee = new Employee(name, age, salary, designation, gender, contactInfo, department, dateOfJoining, performanceRating);
                employees.add(employee);
            }

            // Close the reader
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }

        return employees;
    }

    private static void displayEmployeesTable(List<Employee> employees) {
        // Display header
        System.out.println(formatTableRow(header.split(",")));

        // Display each employee's details
        for (Employee employee : employees) {
            String[] rowData = {
                employee.getName(),
                String.valueOf(employee.getAge()),
                String.valueOf(employee.getSalary()),
                employee.getDesignation(),
                employee.getGender(),
                employee.getContactInfo(),
                employee.getDepartment(),
                employee.getDateOfJoining(),
                String.valueOf(employee.getPerformanceRating())
            };
            System.out.println(formatTableRow(rowData));
        }
    }
}