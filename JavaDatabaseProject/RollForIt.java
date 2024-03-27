public class RollForIt extends CardGame{
    public RollForIt(String deckType, int numCards, int handSize,int complexityLevel, int numComponents, String name, int cost, int playerCount, double playTime, int rating) {
        super(deckType, numCards, handSize, complexityLevel, numComponents, name, cost, playerCount, playTime, rating);
    }
    //Polymorphism
    @Override
    public String toString() {
        return String.format("%s",
                super.toString());
    }
}
