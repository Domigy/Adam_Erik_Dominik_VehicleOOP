public class Main {
    public static void main(String[] args) {
        Car car= new Car("Audi",1998);
        Car car2= new Car("BMW",2004);
        Car car3= new Car("Mazda",1992);
        Motorcycle motorcycle= new Motorcycle("Suzuki", 2004);
        Motorcycle motorcycle2= new Motorcycle("Honda", 1997);
        Boat boat= new Boat();

        car.startEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();
        car.stopEngine();


        System.out.println(motorcycle.toString());
        System.out.println(motorcycle2.toString());
        System.out.println(car.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());


        boat.startEngine();
        boat.stopEngine();
    }
}