package com.payroll;

public abstract class PartTime extends Employee implements IPrintable {

    private double rate;
    private double hoursWorked;

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String printMyData()
    {
        return " rate=" + rate + "\n" +
                ", hoursWorked=" + hoursWorked + "\n" +
                ", getName()=" + getName() + "\n" +
                ", getAge()="
                + getAge() + "\n" +
                ", Employee Has A :" + "\n"+  getVehicle().printMyData() + "\n"+ "";
    }

}
