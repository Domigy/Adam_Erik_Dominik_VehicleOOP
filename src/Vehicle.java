public abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    private String brand;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
