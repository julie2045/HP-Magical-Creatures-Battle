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
        for  (int i = 0;i < availableCreatures.size(); i++){
             System.out.println(String.format("%d %s", i, availableCreatures.get(i).species()));
        }

    System.out.println();
    Scanner input = new Scanner(System.in);
    
    int selectedCreatureIndex;
    // Enter first creature and press Enter
    System.out.println("Enter first creature: "); 
    selectedCreatureIndex = input.nextInt();
    Creature1 = availableCreatures.get(selectedCreatureIndex);
    System.out.println(Creature1.toString());


    // Enter second creature and press Enter
    System.out.println("Enter second creature: "); 
    selectedCreatureIndex = input.nextInt();
    Creature2 = availableCreatures.get(selectedCreatureIndex);
    System.out.println(Creature2.toString());


    //environment if and else statements --> increase strength depening on their best environment 
    System.out.println();
    System.out.println("Pick an environment by typing in the corresponding number! (environment may or may not increase strength depening on the creature): ");
  //creating environment 
      Environment myMountain = Environment.MOUNTAINS;
      Environment mySwamp = Environment.SWAMP;
      Environment myForbiddenForest = Environment.FORBIDDEN_FOREST;
      Environment myUnderworld = Environment.UNDERWORLD; 
  
    //make array of environment to number
      ArrayList<Environment> availableEnvir = new ArrayList<Environment>();  
      availableEnvir.add(myMountain);
      availableEnvir.add(mySwamp);
      availableEnvir.add(myForbiddenForest);
      availableEnvir.add(myUnderworld);
      
       for  (int e = 0;e < availableEnvir.size(); e++){
           System.out.println(String.format("%d %s", e, availableEnvir.get(e)));
          }

      int selectedEnvirIndex;
      //entering environment 
      System.out.println();
      selectedEnvirIndex = input.nextInt();
      selectedEnvir = availableEnvir.get(selectedEnvirIndex);
      System.out.println("Environment is %d", selctedEnvir);
   


    //ask if ready to battle 
    String readyBattle;
    System.out.println("Ready for battle? (yes): ";
    readyBattle = myObj.nextLine();
    system.out.println("Fight!")


    //battle begins, load each decrease of health 

    //show the winner who does not have a health of zero first 
}

