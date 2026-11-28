package Booking.model;

import java.util.HashMap;
import java.util.Map;

public class Tutor {

    private String name = "Jane Doe";
    private Map<String, Grade> instruments = new HashMap<>();

    public Tutor() {
        instruments.put("piano", new Grade(3,7));
        instruments.put("guitar", new Grade(1,5));
        instruments.put("drums", new Grade(2,8));
        instruments.put("mayonnaise", new Grade(6,7));
    }

    public String getName(){
        return name;
    }

    public Map<String, Grade> getInstruments(){
        return instruments;
    }

    public boolean teaches(String instrument, int grade){
        Grade g = instruments.get(instrument.toLowerCase());
        return g != null && g.isAllowed(grade);
    }

}
