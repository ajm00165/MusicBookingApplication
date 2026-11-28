package Booking.model;

public class Grade {
    private int min;
    private int max;

    public Grade(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    public boolean isAllowed(int grade){
        return grade >= min && grade <= max;
    }
}
