package Car;

public abstract class Car {
    private int vinNumber;
    private String make;
    private String model;
    private String mileage;

    public Car(int vinNumber, String make, String model, String mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber=" + vinNumber +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}

