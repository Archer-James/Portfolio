//Group 14 Names: Archer James, Temo Galindo, Long Nguyen, Georgia Watkins, Dylan Moorefield

package org.example.pilatesworkoutplan;

public class Workout {
    private String name;
    private String springs;

    private String muscleGroup;

    private String Link;

    //constructors
    public Workout(){

    }
    public Workout(String name, String springs, String muscleGroup, String link){
        this.name = name;
        this.springs = springs;
        this.muscleGroup = muscleGroup;
        this.Link = link;
    }

    //getters and setters
    public  String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSprings(){
        return this.springs;
    }
    public void setSprings(String springs){
        this.springs=springs;
    }
    public String getMuscleGroup(){
        return this.muscleGroup;
    }
    public void setMuscleGroup(String muscleGroup){
        this.muscleGroup=muscleGroup;
    }

    public String getLink(){return this.Link;}
    public void setLink(String Link){this.Link = Link;}


    @Override
    public String toString(){
        return String.format("%n%-15s%-15s%n%-15s%-15s%n%-15s%-15s%n",
                "Name: ", this.name,
                "Springs: ",this.springs,
                "Muscle Group: ",this.muscleGroup
                );
    }
}
