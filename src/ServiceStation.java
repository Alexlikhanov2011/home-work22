public class ServiceStation {
    public void chek (Car car){
        System.out.println("Начинаем сервис:");
        car.service();
        System.out.println("Сервис окончен!");
    }
    public void chek (Bicycle bicycle){
        System.out.println("Начинаем сервис:");
        bicycle.service();
        System.out.println("Сервис окончен!");
    }
    public void chek (Truck truck){
        System.out.println("Начинаем сервис:");
        truck.service();
        System.out.println("Сервис окончен!");
    }
}
