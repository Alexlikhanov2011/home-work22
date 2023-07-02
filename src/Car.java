public class Car extends MotorTransport {
    public Car(String modelName, int weelsCount) {
        super(modelName, weelsCount);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWeelsCount(); i++) {
updateTyre();
        }
        chekEngine();
    }
}
