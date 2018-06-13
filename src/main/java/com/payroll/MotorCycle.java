package com.payroll;

public class MotorCycle extends Vehicle implements IPrintable {

    @Override
    public String printMyData()
    {
        return "com.payroll.MotorCycle = " + getMake() + ", Plate=" + getPlate() + "]";
    }

}

