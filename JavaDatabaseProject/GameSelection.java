/**
 * Program Purpose: Game Selection.
 * Name: Joshua Preuss, Eva Deans, Archer James
 * Date: 3/15/2024
 * Section: CSC 331 - 001
 */


import java.util.*;
public class GameSelection {
    public static void main(String[] args) {

        String[] gameArray = {"Betrayal at House on the Hill", "Crokinole", "Cthulu Dice", "Doom", "Dungeons & Dragons", "Escape: Curse of the Temple",
                "Everdell", "Fluxx", "Hollow Knight", "Loonacy", "Love Letter", "Mario Kart", "Mysterium", "Night Cage", "Pathfinder", "Play Me", "Poetry for Neanderthals",
                "Roll for It", "Root", "Stardew Valley", "Sushi Go", "Tetris", "Ticket To Ride", "Warhammer", "World of Warcraft", "Zombie Dice"};

        Random rand = new Random();

        String[] smallArray = new String[12];

        for (int i = 0; i < smallArray.length; i++) {
            int index;
            do {
                index = rand.nextInt(gameArray.length);
            } while (Arrays.asList(smallArray).contains(gameArray[index]));

            smallArray[i] = gameArray[index];
        }

        System.out.println("Selected Games: ");
        for (int i = 0; i < smallArray.length; i++) {
            System.out.println(smallArray[i]);
        }
    }



}
