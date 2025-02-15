import java.util.Scanner;

public class textGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Character elara = new Character("Elara the Enchantress",
                "Elara is a skilled sorceress from the mystical Forest of Eldoria. \nShe has spent years studying ancient texts and mastering the art of magic. Her knowledge of spells and potions makes her a valuable ally in the quest.",
                80, 120, 5, 7, 15, 12, 10, 18, 4);

        Character thorn = new Character("Thorn the Rogue",
                "Thorn is a cunning thief who grew up on the streets of a bustling city. He has a knack for stealth and agility, making him an expert at sneaking past enemies and finding hidden treasures.",
                70, 50, 6, 15, 8, 7, 12, 5, 5);

        Character garrick = new Character("Garrick the Warrior",
                "Garrick is a seasoned warrior from a noble lineage. He has trained in combat since childhood and is known for his bravery and strength. He seeks to protect the innocent and restore peace to the land.",
                100, 30, 15, 8, 6, 5, 7, 3, 12);

        String selection;
        Character chosenCharacter = null;

        System.out.println("Welcome to Eternal Quest!!");

        while (true) {
            System.out.printf("\n1. %s\n\n2. %s\n\n3. %s\n", elara.getName(), thorn.getName(), garrick.getName());
            System.out.print("\nPick your character (1-3): ");
            selection = userInput.nextLine();

            switch (selection) {
                case "1":
                    chosenCharacter = elara;
                    break;
                case "2":
                    chosenCharacter = thorn;
                    break;
                case "3":
                    chosenCharacter = garrick;
                    break;
                default:
                    System.out.println("\nInvalid input, please choose either 1, 2, or 3.");
                    continue;
            }
            break;

        }

        System.out.println("\nYou picked ");
        chosenCharacter.displayinfo();

        userInput.close();

        // System.out.println(chosenCharacter.name);

    }

}
