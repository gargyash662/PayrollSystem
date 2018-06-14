package com.payroll;

public class FixedBasedPartTime extends PartTime implements IPrintable {

    private double fixedAmount;

    public double getFixedAmount()
    {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount)
    {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double calcEarning()
    {
        return (getRate() * getHoursWorked()) + fixedAmount;
    }

    @Override
    public String printMyData()
    {
        return "FixedAmount=" + fixedAmount + ", Rate=" + getRate() + ", HoursWorked="
                + getHoursWorked() + ", Name=" + getName() + ", Age=" + getAge() + ", Employee Has A :"
                + getVehicle().printMyData() + "]";
    }

}
