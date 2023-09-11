public class Car {
    private final Engine engine;
    private final CarType carType;
    private final int weight;

    public Car(Engine engine, CarType carType, int weight) {
        this.engine = engine;
        this.carType = carType;
        this.weight = weight;
    }
    public Car(EngineType engineType, double volume,
               int pover,
               CarType carType,
               int weight) {
        this.engine = new Engine(engineType, volume, pover);
        this.carType = carType;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Тип автомобиля: " + carType +
                "\nМасса автомобиля: " + weight +
                "\nТип двигателя: " + engine.getEngineType() +
                "\nОбъём двигателя: " + engine.getVolume() +
                "\nМощность двигателя: " + engine.getPover();
    }
}
