import java.util.Scanner;
public class StringFormat {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String name;
        int level;
        double score;
        
        System.out.println("What is your name?");
        name = userInput.nextLine();
        System.out.println("What level did you end on?");
        level = Integer.parseInt(userInput.nextLine());
        System.out.println("What was your score on the level?");
        score = Double.parseDouble(userInput.nextLine());

        System.out.printf("My name is %s and I am on level %d. The score I got was %.1f", name, level, score);




    }
    
}
