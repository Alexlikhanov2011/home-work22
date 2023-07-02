public class Bicycle extends WeeledTransport  {
    public Bicycle(String modelName, int weelsCount) {
        super(modelName, weelsCount);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWeelsCount(); i++) {
            updateTyre();
        }
    }
}
