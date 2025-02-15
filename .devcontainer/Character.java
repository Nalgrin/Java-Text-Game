public class Character {
    String name;
    String description;
    int health;
    int mana;
    int strength;
    int agility;
    int intelligence;
    int wisdom;
    int charisma;
    int magicPower;
    int defense;


    public Character(String name, String description, int health, int mana, int strength, int agility, int intelligence
    , int wisdom, int charisma, int magicPower, int defense){
        
        this.name = name;
        this.description = description;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this. agility = agility;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.magicPower = magicPower;
        this.defense = defense; 
    }
    


    public void displayinfo(){
        System.out.println("Character: " + name);
        System.out.println("Info:" + description);
        System.out.println("Health:" + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Defense: " + defense);
        
    }

    public String getName() {
        return name;
    }
}
