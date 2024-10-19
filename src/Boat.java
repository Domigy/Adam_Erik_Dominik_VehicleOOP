public class Boat extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("A hajó motorja elindult.");
    }
    @Override
    public void stopEngine(){
        System.out.println("A hajó motorja leállt.");
    }

    public Boat() {
        super("asd",0);

    }
}
