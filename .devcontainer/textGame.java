import java.util.Scanner;
public class textGame {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String character1 = "Elara the Enchantress";
        String info1 = ("Elara is a skilled sorceress from the mystical Forest of Eldoria. \nShe has spent years studying ancient texts and mastering the art of magic. Her knowledge of spells and potions makes her a valuable ally in the quest.");
        String character2 = "Thorn the Rouge";
        String info2 = ("Thorn is a cunning thief who grew up on the streets of a bustling city. He has a knack for stealth and agility, making him an expert at sneaking past enemies and finding hidden treasures.");
        String character3 = "Garrick the Warrior";
        String info3 = ("Garrick is a seasoned warrior from a noble lineage. He has trained in combat since childhood and is known for his bravery and strength. He seeks to protect the innocent and restore peace to the land."); 
        String selection;
        String chosenCharacter = ("");


        
        System.out.println("Welcome to Eternal Quest!!");

        while (true){
            System.out.printf("\n1. %s - %s \n\n2. %s - %s\n\n3. %s - %s\n", character1, info1, character2, info2, character3, info3);
        System.out.print("\nPick your character: ");
        selection = userInput.nextLine();
        
            switch (selection){
                case "1":
                    chosenCharacter = character1;
                    break;
                case "2":
                    chosenCharacter = character2;
                    break;
                case "3":
                    chosenCharacter = character3;
                    break;
                default:
                System.out.println("\nInvalid input, please choose either 1, 2, or 3.");
                continue;
        }
        break;

        }

        System.out.println("\nYou picked " + chosenCharacter);

        userInput.close();

        //if (chosenCharacter = character1)

    }
    
}
