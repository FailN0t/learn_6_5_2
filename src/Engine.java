public class Engine {
    private final EngineType engineType;
    private final double volume;
    private final int pover;

    public Engine(EngineType engineType, double volume, int pover) {
        this.engineType = engineType;
        this.volume = volume;
        this.pover = pover;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return volume;
    }

    public int getPover() {
        return pover;
    }

}
