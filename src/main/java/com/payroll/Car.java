package com.payroll;

public class Car extends Vehicle implements IPrintable {

    @Override
    public String printMyData()
    {
        return "com.payroll.Car =" + getMake() + ", Plate=" + getPlate() + "]";
        //jihbjhbkj
        //Rakhi
    }

}

