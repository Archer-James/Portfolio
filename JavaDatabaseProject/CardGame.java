public class CardGame extends TableGame{
    private String deckType;
    private int numCards;
    private int handSize;

    public CardGame(){this(null,0,0,0,0,null,0,0,0,0);}
    public CardGame(String deckType, int numCards, int handSize, int complexityLevel, int numComponents, String name, int cost, int playerCount, double playTime, int rating){
        super(complexityLevel, numComponents, name, cost, playerCount, playTime, rating);
        this.deckType = deckType;
        this.numCards=numCards;
        this.handSize=handSize;
    }


    public String getDeckType(){return (this.deckType);}
    public int getNumCards(){return (this.numCards);}
    public int getHandSize(){return (this.handSize);}
    public void setDeckType(String deckType){this.deckType = deckType;}
    public void setNumCards(int numCards){this.numCards = numCards;}
    public void setHandSize(int handSize){this.handSize = handSize;}

    //Polymorphism
    @Override
    public String toString(){
        return String.format("%s%-15s%-20s%n%-15s%-20d%n%-15s%-20d%n",
                super.toString(),
                "Deck Type", this.deckType,
                "Card Number", this.numCards,
                "Hand Size", this.handSize);
    }



}
