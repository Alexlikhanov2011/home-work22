public abstract class MotorTransport extends WeeledTransport {
    public MotorTransport(String modelName, int weelsCount) {
        super(modelName, weelsCount);
    }
    void chekEngine(){
        System.out.println("Проверяем двигатель!");
}
}