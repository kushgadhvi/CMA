package cma;

public class SalaryEmployee extends Employee { 
  
    private float monthlySalary;

    
    
    
    public SalaryEmployee(float monthlySalary, int employeeNo, String jobDescription, String lastName, String firstName, char middleInit, String phoneNumber, Address address) {
        super(employeeNo, jobDescription, lastName, firstName, middleInit, phoneNumber, address);
        this.setMonthlySalary(monthlySalary);
    }

    //Getter for MonthlySalary field
    public float getMonthlySalary() {
        return monthlySalary;
    }

    //Setter for monthly salary field
    public void setMonthlySalary(float monthlySalary) {
        //making sure that the salary value isn't negative
        if (monthlySalary < 0) {
            this.monthlySalary = 0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    @Override //makes code more clear and understandable
    public double getEarnings() { //to override the getEarnings abstract method from Employee class
        double income = (monthlySalary * 12) / 26; //calculating bi-weekly earnings
        double earnings = Math.round(income * 100.0) / 100.0; //rounding off the calculated bi-weekly earnings to 2 decimal places
        return earnings;
    }

}
