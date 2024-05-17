/*Lab 8: Polymorphism
Step 2: Now modify the EmployeeUtilities getData() method (EmployeeUtilities created in Lab7 that manipulates an array of Employees 
for a JFrame presentation layer):
 * @author ravneetkaur0125
 */
package cma;

import java.util.ArrayList;

public class EmployeeUtilities {

    // Declaring the parameters of EmployeeUtilities class as per the UML
    private Employee[] employees; //Array of Employee class
    private int current; //pointer defined to point to the current employee record

    public EmployeeUtilities() {//Constructor of the Employee Utilities class
        //Initializing the current employee record pointer to zero
        current = 0;
        //Calling the getData method to initialize array elements for Employee Utilities class
        getData();
    }

    //Method to fetch the details of next employee in the records base with circular reference
    public Employee getNext() {
        current++;
        //check if the current record is the last employee in the list, then reset the pointer to start
        if (current >= employees.length) {
            current = 0;
        }
        return employees[current];
    }

    //Method to fetch the details of previous employee in the records base with circular reference
    public Employee getPrevious() {
        current--;
        //check if the current record is the first employee in the list, then reset the pointer to last
        if (current < 0) {
            current = employees.length - 1;
        }
        return employees[current];
    }

    //Method to fetch the details of current employee record pointed by the current variable
    public Employee getCurrent() {
        return employees[current];
    }

    //Method to fetch the employee details using the Employee Number
    public Employee getEmployeeById(int id) {
        Employee e = null;
        //Using for loop to triage through Employee array
        for (int i = 0; i < employees.length; i++) {
            //Checking if the user entered Employee Id is equal to the Employee Number in array
            if (employees[i].getEmployeeNo() == id) {
                //Assigning the employee details to Employee datatype variable
                e = employees[i];
                //Setting the current pointer to the searched record index
                current = i;
            }
        }
        return e;
    }

    //Method to update Employee details basis the user inputs
    public void updateEmployee(Employee e) {
        employees[current] = e;
    }

    //Method to initialize array elements for Employee class
    public void getData() {

        //Intializing a size 5 array for Address class object to use as input while initializing Employee array
        Address[] addresses = new Address[5];
        //Assigning values to Address class object array
        addresses[0] = new Address("123 Some St.", "Moose Jaw", "SK", "S6H-4R4");
        addresses[1] = new Address("321 Other St.", "Moose Jaw", "SK", "S6H-1V1");
        addresses[2] = new Address("555 Spooky St.", "Regina", "SK", "T6K-4R4");
        addresses[3] = new Address("123 East St.", "Kingston", "ON", "K7M-4G6");
        addresses[4] = new Address("678 West St", "Calgary", "AB", "Q3W-1S2");

        //Intializing a size 5 array for Employee class object
        employees = new Employee[5];

        //Assigning values to Employee class object array using Address class object array
        employees[0] = new SalaryEmployee(4000, 101, "Assistant Manager", "Osborne", "Gavin", 'T', "306.691.1212",
                addresses[0]);
        employees[1] = new HourlyEmployee(12.5f, 30, 102, "Cook", "Goodwin", "Jane", 'S', "306.691.5567",
                addresses[1]);
        employees[2] = new HourlyEmployee(10, 41, 103, "Bar Tender", "Jayesh ", "Sukhdeep", 'S', "306.694.2122",
                addresses[2]);
        employees[3] = new SalaryEmployee(5000, 104, "Manager", "Rina", "Meera ", 'K', "306.691.1213",
                addresses[3]);
        employees[4] = new HourlyEmployee(10, 40, 105, "Bouncer", "Abhilash ", "Chandrakanta", 'C', "306.694.2139",
                addresses[4]);

    }

}
