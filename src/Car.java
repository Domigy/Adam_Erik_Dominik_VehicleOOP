public class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Az autó motorja elindult.");
    }
    @Override
    public void stopEngine(){
        System.out.println("Az autó motorja leállt.");
    }

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String toString() {
        return getBrand()+" márkája " + getYear()+ " gyártás éve.";
    }
}
