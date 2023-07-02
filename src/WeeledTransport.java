public abstract class WeeledTransport implements Transport {
    private String modelName;
    private int weelsCount;
    public WeeledTransport(String modelName, int weelsCount) {
        this.modelName = modelName;
        this.weelsCount = weelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWeelsCount() {
        return weelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
