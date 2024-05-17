package cma;

public abstract class Employee {

    private int employeeNo;
    private String jobDescription;
    private String lastName;
    private String fristName;
    private char middleInit;
    private String phoneNumber;
//    private Address address;

    public Employee(int employeeNo, String jobDescription, String lastName, String firstName, char middleInit, String phoneNumber) {
        this.employeeNo = employeeNo;
        this.jobDescription = jobDescription;
        this.lastName = lastName;
        this.fristName = firstName;
        this.middleInit = middleInit;
        this.phoneNumber = phoneNumber;
//        this.address = address;
    }

   
    public abstract double getEarnings();

    /**
     * @return the employeeNo
     */
    public int getEmployeeNo() {
        return employeeNo;
    }

    /**
     * @param employeeNo the employeeNo to set
     */
    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * @return the jobDescription
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * @param jobDescription the jobDescription to set
     */
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the fristName
     */
    public String getFristName() {
        return fristName;
    }

    /**
     * @param fristName the fristName to set
     */
    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    /**
     * @return the middleInit
     */
    public char getMiddleInit() {
        return middleInit;
    }

    /**
     * @param middleInit the middleInit to set
     */
    public void setMiddleInit(char middleInit) {
        this.middleInit = middleInit;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    /**
//     * @return the address
//     */
//    public Address getAddress() {
//        return address;
//    }
//
//    /**
//     * @param address the address to set
//     */
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
