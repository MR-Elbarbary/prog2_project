package skyglide.classes.cabin;

import java.util.ArrayList;

public class LargeCabin extends Cabin {
    public LargeCabin(){
        setNumberOfSeats(100);
        setSeats(CreateSeats(this.NumberOfSeats));
    }

    public void showseats(){
        System.out.print(seats);
    }

    public ArrayList<Seat> CreateSeats(int numberOfSeats){  // can do it better by starting with an array then make it to arraylist
        ArrayList<Seat> Seats = new ArrayList<Seat>();
        for (int i = 0; i < numberOfSeats; i++) {
            Seats.add(new Seat(100+i));
        }
        return Seats;
    }
}
