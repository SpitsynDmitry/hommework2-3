public class ServiceStation1 implements Service {
    public void print(Bicycle bicycles) {
        System.out.println(" Велосипед");
        printBicycle(bicycles);
        System.out.println();
    }

    public void print(Car cars) {
        System.out.println(" Жигули");
        printBicycle(cars);
        cars.checkEngine();
        System.out.println();
    }

    public void print(Truck trucks) {
        System.out.println(" Камаз");
        printBicycle(trucks);
        trucks.checkEngine();
        trucks.checkTrailer();
        System.out.println();
    }


    public void printBicycle( Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }

        }
    }
}
