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
        return "\n" +" Commission=" + commissionPerc + "\n" +
                " Rate=" + getRate() + "\n" + " HoursWorked="
                + getHoursWorked() + "\n"+ " Name=" + getName() + "\n"+ " Age=" + getAge() + "\n"+ " Employee Has A :"
                + getVehicle().printMyData() + "\n";
    }

}
