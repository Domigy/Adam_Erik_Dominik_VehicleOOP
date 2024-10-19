public class Motorcycle extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("A motor motorja elindult.");
    }
    @Override
    public void stopEngine(){
        System.out.println("A motor motorja leállt.");
    }
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String toString() {
        return getBrand()+" márkája " + getYear()+ " gyártás éve.";
    }
}
