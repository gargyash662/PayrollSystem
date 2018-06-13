package com.payroll;

public abstract class Vehicle implements IPrintable {

    private String make;
    private String plate;

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getPlate()
    {
        return plate;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }
//this is demo comment
    @Override
    public String printMyData()
    {
        return "[Make=" + make + ", Plate=" + plate + "]";
    }

}
