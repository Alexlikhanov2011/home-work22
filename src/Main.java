public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car1",4);
        Truck truck = new Truck("truck1",8);
        Truck truck2 = new Truck("truck2",6);
        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        station.chek(car2);
        station.chek(bicycle);
        station.chek(truck);
        station.chek(car);
    }
}