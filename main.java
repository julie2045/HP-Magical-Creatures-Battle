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
<<<<<<< HEAD
        availableCreatures.add(myUnicorn);
        for  (int i = 0;i < availableCreatures.size(); i++){
          System.out.println( i + " " + availableCreatures.get(i).species());
=======
        availableCreatures.add(myUnicorn);     
        for  (int i = 0;i < availableCreatures.size(); i++){
          System.out.println(availableCreatures.get(i).species());
>>>>>>> afe513b22c69e9241df9f1d08d707a650656720e
          }

    System.out.println();
    Scanner input = new Scanner(System.in);
    
    int selectedCreatureIndex;
    // Enter first creature and press Enter
    System.out.println("Enter first creature: "); 
<<<<<<< HEAD
    selectedCreatureIndex = input.nextInt();
    System.out.println(availableCreatures.get(selectedCreatureIndex).toString());

=======
    selectedCreatureIndex = input.nextInt();   //takes in the user input
    System.out.println(availableCreatures.get(selectedCreatureIndex).description()); //puts the number to the corresponding creature and prints out description
         
 
>>>>>>> afe513b22c69e9241df9f1d08d707a650656720e

    // Enter second creature and press Enter
    System.out.println("Enter second creature: "); 
<<<<<<< HEAD
    selectedCreatureIndex = input.nextInt();
    System.out.println(availableCreatures.get(selectedCreatureIndex).toString());
=======
    selectedCreatureIndex = input.nextInt();    //takes in the user input
    System.out.println(availableCreatures.get(selectedCreatureIndex).description());//puts the number to the corresponding creature and prints out description
         

>>>>>>> afe513b22c69e9241df9f1d08d707a650656720e


    //environment if and else statements --> increase strength depening on their best environment 
    
   


    //ask if ready to battle 
    String readyBattle;
    System.out.println("Ready for battle? (yes): ";
    readyBattle = myObj.nextLine();
    system.out.println("Fight!")


    //battle begins, load each decrease of health 

    //show the winner who does not have a health of zero first 
}

