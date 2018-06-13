package com.payroll;

import com.payroll.PartTime;

public class CommissionBasedPartTime extends PartTime implements IPrintable {

    private double commissionPerc;

    public double getCommissionPerc()
    {
        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc)
    {
        this.commissionPerc = commissionPerc;
    }

    @Override
    public double calcEarning()
    {
        return (getRate() * getHoursWorked()) + ((commissionPerc / 100) * (getRate() * getHoursWorked()));
    }

    @Override
    public String printMyData()
    {
        return " Commission=" + commissionPerc + ", Rate=" + getRate() + ", HoursWorked="
                + getHoursWorked() + ", Name=" + getName() + ", Age=" + getAge() + ", vehicle="
                + getVehicle().printMyData() + "]";
    }

}
