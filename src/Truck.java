public class Truck extends Car {
    public Truck(String modelName, int weelsCount) {
        super(modelName, weelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
super.service();
checkTrailer();
    }
}
