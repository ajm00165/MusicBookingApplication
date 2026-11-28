package Booking.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Booking {

    private final String id;
    private final String matric;
    private final String pupilName;
    private final String instrument;
    private final LocalDate date;
    private final LocalTime start;

    public Booking(String matric, String pupilName, String instrument, LocalDate date, LocalTime start){
        this.id = UUID.randomUUID().toString();
        this.matric = matric;
        this.pupilName = pupilName;
        this.instrument = instrument;
        this.date = date;
        this.start = start;
    }

    public String getID(){
        return id;
    }

    public String getMatric(){
        return matric;
    }

    public String getPupilName(){
        return pupilName;
    }

    public String getInstrument(){
        return instrument;
    }

    public LocalDate getDate(){
        return date;
    }

    public LocalTime getStart(){
        return start;
    }

}
