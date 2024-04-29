package skyglide.classes.aircraft;

import skyglide.classes.engine.Engine;

public abstract class Aircraft {
    private String name;
    private String plate;
    private Engine engine;
    public String getName() {
        return name;
    }
    public String getPlate() {
        return plate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
}