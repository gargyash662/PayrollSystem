package com.payroll;

import com.payroll.Employee ;

public class FullTime extends Employee implements IPrintable {

    private double salary;
    private double bonus;

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public double calcEarning()
    {
        return salary + bonus;
    }

    @Override
    public String printMyData()
    {
        return "Salary= " + salary + ", Bonus=" + bonus + ", Name=" + getName() + ", Age=" + getAge()
                + ", vehicle=" + getVehicle().printMyData() +"]";
    }


}
