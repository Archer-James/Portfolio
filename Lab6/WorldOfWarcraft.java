public class WorldOfWarcraft extends VideoGame{
    public WorldOfWarcraft(String platform,String genre, String name, int cost, int playerCount, double playTime, int rating ) {
        super(platform, genre, name, cost, playerCount, playTime, rating);
    }
    //Polymorphism
    @Override
    public String toString() {
        return String.format("%s",
                super.toString());
    }
}
