<h1 align="center"> Employee payment Calculator </h1>

[![Java](https://img.shields.io/badge/Java-11-blue)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![Java Standard Library](https://img.shields.io/badge/Java%20Standard%20Library-8-blue)](https://docs.oracle.com/javase/8/docs/api/)



This Java program calculates the payment for a group of employees based on their working hours and hourly rate. It allows for both regular and outsourced employees.

<h1 align="center"> How to Use </h1>

1. Clone this repository or download the source code.
2. Compile the `Main.java` file using a Java compiler.
3. Run the compiled program using `java Main` command.
4. Follow the prompts to input the number of employees and their details.

<h1 align="center"> Imput Details </h1>

- **Number of Employees**: Enter the total number of employees.
- **Employee Information**: For each employee, provide the following details:
  - Outsourced (y/n)?: Specify whether the employee is outsourced (y) or not (n).
  - Name: Enter the name of the employee.
  - Hours: Enter the number of hours worked by the employee.
  - Value per Hour: Enter the hourly rate for the employee.
  - Additional charge (if outsourced): If the employee is outsourced, provide an additional charge.

<h1 align="center"> Output </h1>

After inputting the details for all employees, the program will display the payment information for each employee, including their name and calculated payment.

<h1 align="center"> Sample Usage </h1>

Java Main
Enter the number of employees: 3 
Employee #1 : Outsourced (y/n) ? n 
Name: John Doe Hours: 40 
Value per Hour: 15.0 
Employee #2 : Outsourced (y/n) ? y 
Name: Jane Smith Hours: 30 
Value per Hour: 20.0 
Additional charge: 100.0 
Employee #3 : Outsourced (y/n) ? n 
Name: Michael Johnson Hours: 45 
Value per Hour: 18.0

PAYMENTS: John Doe - $600.00 Jane Smith - $700.00 Michael Johnson - $810.00
