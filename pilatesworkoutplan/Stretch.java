//Group 14 Names: Archer James, Temo Galindo, Long Nguyen, Georgia Watkins, Dylan Moorefield

package org.example.pilatesworkoutplan;

public class Stretch extends Workout {
    private int time;
    //constructor
    public Stretch(String name, String springs, String muscleGroup, String link) {
        super(name, springs, muscleGroup, link);
    }
    //getters and setters
    public int getTime() { return this.time; }
    public void setTime(int time) { this.time = time; }

    // Polymorphism
    @Override
    public String toString() {
        return String.format("%s%-15s%-20d%n",
                super.toString(), "Time", this.time);
    }
}
