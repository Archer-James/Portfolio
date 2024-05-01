//Group 14 Names: Archer James, Temo Galindo, Long Nguyen, Georgia Watkins, Dylan Moorefield


package org.example.pilatesworkoutplan;

import org.example.pilatesworkoutplan.Workout;

public class Cardio extends Workout {
    private int time;
    //constructor
    public Cardio(String name, String springs, String muscleGroup, String link) {
        super(name, springs, muscleGroup, link);
    }
    //getters and setters
    public int getReps() { return this.time; }
    public void setReps(int time) { this.time = time; }

    // Polymorphism
    @Override
    public String toString() {
        return String.format("%s%-15s%-20d%n",
                super.toString(), "Time", this.time);
    }
}
