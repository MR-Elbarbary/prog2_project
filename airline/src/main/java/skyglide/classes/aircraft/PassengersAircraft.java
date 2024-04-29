package skyglide.classes.aircraft;

import skyglide.classes.cabin.Cabin;

public abstract class PassengersAircraft extends Aircraft {
    private Cabin cabin;
    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }
    public Cabin getCabin() {
        return cabin;
    }
}