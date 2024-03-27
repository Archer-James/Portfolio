public class TableGame extends Game{
    private int complexityLevel;
    private int numComponents;

    public TableGame(){
        this(0,0,null,0,0,0,0);
    }
    public TableGame(int complexityLevel, int numComponents, String name, int cost, int playerCount, double playTime, int rating){
        super(name, cost, playerCount, playTime, rating);
        this.complexityLevel = complexityLevel;
        this.numComponents = numComponents;
    }

    public int getComplexityLevel(){return(this.complexityLevel);}

    public int getNumComponents(){return (this.numComponents);}

    public void setComplexityLevel(int complexityLevel){this.complexityLevel = complexityLevel;}

    public void setNumComponents(int numComponents){this.numComponents = numComponents;}

    //Polymorphism
    @Override
    public String toString(){
        return String.format("%s%-15s%-20d%n%-15s%-20d%n",
                super.toString(),
                "Complexity", this.complexityLevel,
                "# Components", this.numComponents);
    }
}
