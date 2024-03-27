public class Game {
    private String name;
    private int cost;
    private int playerCount;
    private double playTime;
    private int rating;


    public Game(){
        this(null, 0,0,0,0);
    }
    public Game (String name, int cost, int playerCount, double playTime, int rating){
        this.name = name;
        this.cost = cost;
        this.playerCount = playerCount;
        this.playTime = playTime;
        this.rating = rating;
    }

    public  void setName(String name){
        this.name = name;
    }
    public void setCost(int cost){this.cost = cost;}
    public void setPlayerCount(int playerCount){
        this.playerCount = playerCount;
    }
    public void setPlayTime(int playTime){
        this.playTime = playTime;
    }
    public void setRating(int rating){
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }
    public int getCost() {
        return this.cost;
    }
    public int getPlayerCount(){
        return this.playerCount;
    }
    public double getPlayTime(){
        return this.playTime;
    }
    public int getRating(){
        return this.rating;
    }

    //Polymorphism
    @Override
    public String toString(){
        return String.format("%n%-15s%-20s%n%-15s%-20d%n%-15s%-20d%n%-15s%-20f%n%-15s%-20d%n",
        "Name", this.name,
        "Cost", this.cost,
        "Player Count", this.playerCount,
        "Play Time", this.playTime,
        "Rating", this.rating);
    }
}



