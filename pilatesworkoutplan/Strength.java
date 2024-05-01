//Group 14 Names: Archer James, Temo Galindo, Long Nguyen, Georgia Watkins, Dylan Moorefield

package org.example.pilatesworkoutplan;

public class Strength extends Workout {
    private int reps;
    //constructor
    public Strength(String name, String springs, String muscleGroup, String link) {
        super(name, springs, muscleGroup, link);
    }
    //getters and setters
    public int getReps() { return this.reps; }
    public void setReps(int reps) { this.reps = reps; }

    // Polymorphism
    @Override
    public String toString() {
        return String.format("%s%-15s%-20d%n",
                super.toString(), "Reps", this.reps);
    }
}