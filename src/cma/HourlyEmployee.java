package cma;

public class HourlyEmployee extends Employee {

    private float hourlyRate;

    public HourlyEmployee(float hourlyRate, int employeeNo, String jobDescription, String lastName, String firstName, char middleInit, String phoneNumber) {
        super(employeeNo, jobDescription, lastName, firstName, middleInit, phoneNumber);
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return this.getFristName() + ' ' + this.getMiddleInit() + ' ' + this.getLastName();
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getEarnings() {
        double earnings = 0;
        return earnings;
    }
}
