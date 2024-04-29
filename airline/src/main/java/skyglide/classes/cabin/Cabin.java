package skyglide.classes.cabin;

import java.util.ArrayList;

public abstract class Cabin {
    int NumberOfSeats;
    ArrayList<Seat> seats;
    
    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return NumberOfSeats;
    }
    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    public ArrayList<Seat> getSeats() {
        return seats;
    }
}