public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);


        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);


        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation station = new ServiceStation();
        station.print(bicycle);
        station.print(bicycle2);
        station.print(car);
        station.print(car2);
        station.print(truck);
        station.print(truck2);

        ServiceStation1 station1 = new ServiceStation1();
        station1.print(bicycle);
        station1.print(bicycle2);
        station1.print(car);
        station1.print(car2);
        station1.print(truck);
        station1.print(truck2);

    }
}