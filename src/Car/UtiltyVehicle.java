package Car;

public class UtiltyVehicle extends Car{
    private boolean fourWheelDrive;

    public UtiltyVehicle(int vinNumber, String make, String model, String mileage, boolean towinCapacity) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = towinCapacity;
    }

    public boolean isTowinCapacity() {
        return fourWheelDrive;
    }

    public void setTowinCapacity(boolean towinCapacity) {
        this.fourWheelDrive = towinCapacity;
    }
}
