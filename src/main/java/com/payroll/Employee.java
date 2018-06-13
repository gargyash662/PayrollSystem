
package com.payroll;

public abstract class Employee implements IPrintable {

    private String name;
    private int age;
    private Vehicle vehicle;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int calcBirthYear()
    {
        return 2018 - age;
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public double calcEarning()
    {
        return 1000;
    }

    @Override
    public String printMyData()
    {
        return "name=" + name + ", age=" + age + ", vehicle=" + getVehicle().printMyData() + "";
    }

}
