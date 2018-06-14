package com.payroll;

public class Intern extends Employee implements IPrintable {

    private String schoolName;

    public String getSchoolName()
    {
        return schoolName;
    }

    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

    @Override
    public String printMyData()
    {
        return "SchoolName=" + schoolName + ", Name=" + getName() + ", Age=" + getAge() + ", Employee Has A :"
                + getVehicle().printMyData() + "";
    }

}
