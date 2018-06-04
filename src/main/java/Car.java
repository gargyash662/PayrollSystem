public class Car extends Vehicle implements IPrintable {

    @Override
    public String printMyData()
    {
        return "Car =" + getMake() + ", Plate=" + getPlate() + "]";
    }

}

