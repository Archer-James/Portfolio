public class EscapeCurseOfTheTemple extends BoardGame{
    public EscapeCurseOfTheTemple(int boardSize, int complexityLevel, int numComponents,
                                  String name, int cost, int playerCount, double playTime, int rating) {
        super(boardSize, complexityLevel, numComponents, name, cost, playerCount, playTime, rating);
    }
    //Polymorphism
    @Override
    public String toString() {
        return String.format("%s",
                super.toString());
    }
}
