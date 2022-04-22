import java.util.Scanner; // import the Scanner class 
import java.util.ArrayList; // import the ArrayList class

public class Main {

    public static void main(String[] args) {

        //displaying title and info about game 
        System.out.println("Harry Potter Magical Creatures Battle!");
        System.out.println("-".repeat(93));

        System.out.println("Play against yourself/another person and choose the best mythical creature to win the battle! ");

        System.out.println("Choose your magical creature  with the corresponding number to use for battle!(0-5)");
        System.out.println("-".repeat(93));
 

        //creating the creatures 
        var myDragon = new Dragon();
        var myHippogriff = new Hippogriff();
        var myMandrake = new Mandrake();
        var myThreeHeadedDog = new ThreeHeadedDog();
        var myTroll = new Troll();
        var myUnicorn = new Unicorn();

 //make array of creatures to number
      ArrayList<Creature> = availableCreatures = new ArrayList<Creature>();  
        availableCreatures.add(myDragon);
        availableCreatures.add(myHippogriff);
        availableCreatures.add(myMandrake);
        availableCreatures.add(myThreeHeadedDog);
        availableCreatures.add(myTroll);
        availableCreatures.add(myUnicorn);     
        System.out.println("Dragon (0), Hippogriff (1), Mandrake (2), ThreeHeadedDog (3), Troll (4), Unicorn (5)");

    System.out.println();
    Scanner input = new Scanner(System.in);
    
    // Enter first creature and press Enter
    System.out.println("Enter first creature: "); 
    selectedCreatureIndex = input.nextInt();   //takes in the user input
    System.out.println(availableCreatures.get(selectedCreatureIndex).description()); //puts the number to the corresponding creature and prints out description
         
 

    // Enter second creature and press Enter
    System.out.println("Enter second creature: "); 
    selectedCreatureIndex = input.nextInt();    //takes in the user input
    System.out.println(availableCreatures.get(selectedCreatureIndex).description());//puts the number to the corresponding creature and prints out description
         



    //environment if and else statements --> increase strength depening on their best environment 
    System.out.println();
    System.out.println("Pick an environment! (environment may or may not increase strength depening on the creature): ");
    chosenEnvir() = myObj.nextLine();


    //ask if ready to battle 
    String readyBattle;
    System.out.println("Ready for battle? (yes): ";
    readyBattle = myObj.nextLine();
    system.out.println("Fight!")


    //battle begins, load each decrease of health 

    //show the winner who does not have a health of zero first 
}

