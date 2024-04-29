package skyglide.classes.aircraft;

import skyglide.classes.cabin.Cabin;
import skyglide.classes.engine.Engine;

public class LargepassengersAircraft extends PassengersAircraft {
    public LargepassengersAircraft(String name, String plate, Cabin cabin, Engine engine){
        setName(name);
        setPlate(plate);
        setCabin(cabin);
        setEngine(engine);
    }
}
