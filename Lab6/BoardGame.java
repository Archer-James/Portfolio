public class BoardGame extends TableGame{
    private int boardSize;

    public BoardGame(){this(0,0,0,null,0,0,0,0);}

    public BoardGame(int boardSize, int complexityLevel, int numComponents,
                     String name, int cost, int playerCount, double playTime, int rating){
        super(complexityLevel, numComponents, name, cost, playerCount, playTime, rating);
        this.boardSize = boardSize;
    }

    public int getBoardSize(){return (this.boardSize);}

    public void setBoardSize(int boardSize){this.boardSize = boardSize;}

    //Polymorphism
    @Override
    public String toString(){
        return String.format("%s%-15s%-20d%n",
                super.toString(),
                "Board Size", this.boardSize);
    }
}
