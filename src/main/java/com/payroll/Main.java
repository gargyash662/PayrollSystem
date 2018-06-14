package com.payroll;

public class Main {

    public static void main(String[] args) {

        FullTime f = new FullTime();
        f.setName("John");
        f.setAge(26);
        f.setSalary(60000);
        f.setBonus(15000);
        Vehicle car = new Car();
        car.setMake("Renault");
        car.setPlate("JHXCV789");
        f.setVehicle(car);

        //System.out.println("Full Time Employee's Total Earnings : " + f.calcEarning());
        //System.out.println("Full Time Employee's Birth Year : " + f.calcBirthYear());
        System.out.println("Full Time Employee's data : " + f.printMyData());

        CommissionBasedPartTime c = new CommissionBasedPartTime();
        c.setName("Mike");
        c.setAge(24);
        c.setRate(30);
        c.setHoursWorked(10);
        c.setCommissionPerc(20);
        Vehicle bike = new MotorCycle();
        bike.setMake("Honda");
        bike.setPlate("YTYUTU897");
        c.setVehicle(bike);
        //System.out.println("Commission Based Part time Employee's Total Earnings : " + c.calcEarning());
        //System.out.println("Commission Based Part time Employee's Birth Year : " + c.calcBirthYear());
        System.out.println("Commission Based Part time Employee's data : " + c.printMyData());

        FixedBasedPartTime fixed = new FixedBasedPartTime();
        fixed.setName("Alex");
        fixed.setAge(28);
        fixed.setRate(25);
        fixed.setHoursWorked(40);
        fixed.setFixedAmount(30000);
        Vehicle car1 = new Car();
        car1.setMake("Ford");
        car1.setPlate("CVCNBV467");
        fixed.setVehicle(car1);
        //System.out.println("Fixed Based Part time Employee's Total Earnings : " + fixed.calcEarning());
        //System.out.println("Fixed Based Part time Employee's Birth Yaer : " + fixed.calcBirthYear());
        System.out.println("Fixed Based Part time Employee's data : " + fixed.printMyData());

        Intern i = new Intern();
        i.setName("Yash");
        i.setAge(23);
        i.setSchoolName("ABC School");
        Vehicle bike1= new MotorCycle();
        bike1.setMake("Royal Enfield");
        bike1.setPlate("BNNGH765");
        i.setVehicle(bike1);
        //System.out.println("Intern's Total Earnings : " + i.calcEarning());
        //System.out.println("Intern's Birth Year : " + i.calcBirthYear());
        System.out.println("Intern"+ i.printMyData());

        FullTime rr = new FullTime();
        rr.setName("Rakhi");
        rr.setAge(24);
        rr.setSalary(100000);
        rr.setBonus(20000);
        Vehicle car2 = new Car();
        car2.setMake("Bentley");
        car2.setPlate("Continental");
        rr.setVehicle(car2);
        System.out.println("full time"+ rr.printMyData());

        Intern i2 = new Intern();
        i2.setName("Manpreet");
        i2.setAge(23);
        i2.setSchoolName("Lambton");
        Vehicle bike2 = new MotorCycle();
        bike2.setMake("abc");
        bike2.setPlate("mann1234");
        i2.setVehicle(bike2);
        System.out.println("Intern" + i2.printMyData());



    }
}
