public class VideoGame extends Game{
    private String platform;
    private String genre;

    public VideoGame(){this(null,null, null,0,0,0,0);}
    public VideoGame(String platform,String genre, String name, int cost, int playerCount, double playTime, int rating ){
        super(name, cost, playerCount, playTime, rating);
        this.platform = platform;
        this.genre = genre;
    }

    public String getPlatform(){return (this.platform);}

    public String getGenre(){return (this.genre);}

    public void setPlatform(String platform){this.platform = platform;}

    public void setGenre(String genre){this.genre = genre;}

    //Polymorphism
    @Override
    public String toString(){
        return String.format("%s%-15s%-20s%n%-15s%-20s%n",
        super.toString(),
        "Platform", this.platform,
        "Genre", this.genre);
    }
}
