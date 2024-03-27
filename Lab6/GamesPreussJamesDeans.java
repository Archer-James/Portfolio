/*
Authors: Archer James, Eva Deans, Joshua Preuss
Date: 03/14/2024
Class: CSC 331-001
Assignment: Lab 6
 */
import java.util.Scanner;

/**
 * Main function for the class
 * Initializes instances of every game
 * Adds the games to arrays based on their type
 * Gets inputs from user and prints tables based on the input
 */
public class GamesPreussJamesDeans {
    public static void main(String[] args) {

        //Initializing table games and table game array
        Game[] tableGames = new Game[7];
        Game escapeCurseOfTheTemple = new EscapeCurseOfTheTemple(17, 2, 78, "Escape: Curse of the Temple", 50, 5, 0.1, 7);
        Game mysterium = new Mysterium(11, 1, 8, "Mysterium", 54, 7, 0.7, 7);
        Game betrayalAtHouseOnTheHill = new BetrayalAtTheHouseOnTheHill(10, 2, 90, "Betrayal at House on the Hill", 80, 6, 1, 7);
        Game dungeonsAndDragons = new DungeonsAndDragons(25, 3, 15, "Dungeons and Dragons", 50, 4, 52, 9);
        Game crokinole = new Crokinole(22, 1, 13, "Crokinole", 87, 4, 0.3, 8);
        Game rollForIt = new RollForIt("Card", 50, 3, 1, 58, "Roll for It", 20, 4, 0.7, 10);
        Game loonacy = new Loonacy("Card", 52, 7, 1, 60, "Loonacy", 20, 5, 10, 10);
        //add games to the array
        tableGames[0] = escapeCurseOfTheTemple;
        tableGames[1] = mysterium;
        tableGames[2] = betrayalAtHouseOnTheHill;
        tableGames[3] = dungeonsAndDragons;
        tableGames[4] = crokinole;
        tableGames[5] = rollForIt;
        tableGames[6] = loonacy;

        //initializing video games and array
        Game[] videoGames = new Game[5];
        Game worldOfWarcraft = new WorldOfWarcraft("PC", "MMORPG", "World of WarCraft", 15, 1, 2701, 7);
        Game stardewValley = new StardewValley("PC,Switch", "Indie", "Stardew Valley", 15, 4, 53, 10);
        Game marioKart = new MarioKart("Switch", "Racing", "Mario Kart", 40, 8, 6, 9);
        Game hollowKnight = new HollowKnight("PC", "Fighting", "Hollow Knight", 15, 1, 27, 9);
        Game doom = new Doom("PC", "Adventure", "Doom", 20, 1, 12, 9);
        //adding video games to array
        videoGames[0] = worldOfWarcraft;
        videoGames[1] = stardewValley;
        videoGames[2] = marioKart;
        videoGames[3] = hollowKnight;
        videoGames[4] = doom;

        //get input from user for table or video game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like [1] table game or [2] video game? Enter number: ");
        int type = scanner.nextInt();
        System.out.printf("%-3s%-30s%-30s%-30s%-30s%-30s%n", " ", "Name", "Cost($)", "Players", "Time(Hours)", "Rating");
        // print table for table games
        if (type == 1) {
            for (int index = 0; index < tableGames.length; index++) {
                System.out.printf("%-3d%-30s%-30d%-30d%-30.2f%-30d%n",
                        index + 1,
                        tableGames[index].getName(),
                        tableGames[index].getCost(),
                        tableGames[index].getPlayerCount(),
                        tableGames[index].getPlayTime(),
                        tableGames[index].getRating()
                );
            }
            //get game choice from user and display information
            System.out.println("Enter number in list of game you want: ");
            int game = scanner.nextInt();
            System.out.println(tableGames[game - 1].toString());
            //get input of yes or no from user
            System.out.println("Would you like to purchase this game? [1]Yes [2]No");
            int answer = scanner.nextInt();
            //for yes get input of how many and print the cost
            if (answer == 1) {
                System.out.println("Enter how many copies you want to purchase: ");
                int ans = scanner.nextInt();
                System.out.println("Total Cost");
                System.out.println(tableGames[game - 1].getCost() * ans);
            }
            //print goodbye if user says no
            else {
                System.out.println("GoodBye");
            }
        } else {
            // print table for video games
            for (int index = 0; index < videoGames.length; index++) {
                System.out.printf("%-3d%-30s%-30d%-30d%-30.2f%-30d%n",
                        index + 1,
                        videoGames[index].getName(),
                        videoGames[index].getCost(),
                        videoGames[index].getPlayerCount(),
                        videoGames[index].getPlayTime(),
                        videoGames[index].getRating()
                );
            }
            //get game choice from user and display information
            System.out.println("Enter number of game in list you want: ");
            int game = scanner.nextInt();
            System.out.println(videoGames[game - 1].toString());
            //get input of yes or no from user
            System.out.println("Would you like to purchase this game? [1]Yes [2]No");
            int answer = scanner.nextInt();
            //for yes get input of how many and print the cost
            if (answer == 1) {
                System.out.println("Enter how many copies you want to purchase: ");
                int ans = scanner.nextInt();
                System.out.println("Total Cost");
                System.out.println(videoGames[game - 1].getCost() * ans);
            }
            //print goodbye if user says no
            else {
                System.out.println("GoodBye");
            }

        }
        //Polymorphism is used throughout the project with the overridden toString methods.
        //Each instance of polymorphism is specified with //Polymorphism above it.


    }
}
