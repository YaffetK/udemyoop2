package OopPartTwo.Composition;

public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name,int doors, int engincCapacity){
        super(name);
        this.doors=doors;
        this.engineCapacity=engineCapacity;
    }


}
