package Booking.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Slot {

    private final LocalDate date;
    private final LocalTime start;
    private boolean blocked = false;
    private Booking booking;

    public Slot(LocalDate date, LocalTime start){
        this.date = date;
        this.start = start;
    }

    public LocalDate getDate(){
        return date;
    }

    public LocalTime getStart(){
        return start;
    }

    public boolean isFree(){
        return !blocked && booking == null;
    }

    public boolean isBlocked(){
        return blocked;
    }

    public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }

    public Booking getBooking(){
        return booking;
    }

    public void setBooking(Booking booking){
        this.booking = booking;
    }

}
