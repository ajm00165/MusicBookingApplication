package Booking.model;

import java.util.Map;

public class Pupil {

    private int age;
    private String name;
    private String matric;
    private Map<String, InstrumentGrade> instruments;

    public static class InstrumentGrade{
        private int grade;
        public int getGrade(){
            return grade;
        }
        public void setGrade(int grade){
            this.grade = grade;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMatric(){
        return matric;
    }

    public void setMatric(String matric){
        this.matric = matric;
    }

    public Map<String, InstrumentGrade> getInstruments(){
        return instruments;
    }

    public void setInstruments(Map<String, InstrumentGrade> instruments){
        this.instruments = instruments;
    }
}
