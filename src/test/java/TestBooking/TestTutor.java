package TestBooking;

import Booking.model.Tutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTutor {

    private final Tutor tutor = new Tutor();

    @Test
    void teachesInRange(){
        assertTrue(tutor.teaches("piano", 5));
        assertTrue(tutor.teaches("piano", 3));
        assertTrue(tutor.teaches("piano", 7));
    }

    @Test
    void rejectsOutOfRange(){
        assertFalse(tutor.teaches("piano",1));
        assertFalse(tutor.teaches("piano",9));
    }

    @Test
    void teachesAllInstruments(){
        assertTrue(tutor.teaches("piano", 5));
        assertTrue(tutor.teaches("guitar", 3));
        assertTrue(tutor.teaches("drums", 3));
    }

    @Test
    void rejectsUnknownInstrument(){
        assertFalse(tutor.teaches("didgeridoo", 1));
    }

}


