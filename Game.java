import java.util.Scanner; // import the Scanner class 
import java.util.ArrayList; // import the ArrayList class
import java.lang.Math;

class Game {
  Creature player1, player2;
  Environment environment;

    void startGame() {
        //displaying title and info about game 
        System.out.println("Harry Potter Magical Creatures Battle!");
        System.out.println("-".repeat(70));

        System.out.println("Play against yourself/another person and choose the best mythical creature to win the battle! ");

        System.out.println("Choose your magical creature with the corresponding number to use for battle!(0-5)");
        System.out.println("-".repeat(70));
         
     //creating the creatures 
        var myDragon = new Dragon();
        var myHippogriff = new Hippogriff();
        var myMandrake = new Mandrake();
        var myThreeHeadedDog = new ThreeHeadedDog();
        var myTroll = new Troll();
        var myUnicorn = new Unicorn();

    
    
//user input
    System.out.println();
    Scanner input = new Scanner(System.in);
  //make array of creatures to number
        ArrayList<Creature> availableCreatures = new ArrayList<Creature>();  
        availableCreatures.add(myDragon);
        availableCreatures.add(myHippogriff);
        availableCreatures.add(myMandrake);
        availableCreatures.add(myThreeHeadedDog);
        availableCreatures.add(myTroll);
        availableCreatures.add(myUnicorn);

      
        for  (int i = 0;i < availableCreatures.size(); i++){
           System.out.println(String.format("%d %s", i, availableCreatures.get(i).species()));
          }
        
   
    int selectedCreatureIndex;
    
    // Enter first creature and press Enter
    System.out.println();
    System.out.println("Enter first creature: "); 
    selectedCreatureIndex = input.nextInt();
    this.player1 = availableCreatures.get(selectedCreatureIndex);
    System.out.println(this.player1.toString());
      
      // Enter second creature and press Enter
    System.out.println();
    System.out.println("Enter second creature: "); 
    selectedCreatureIndex = input.nextInt();   
    this.player2 = availableCreatures.get(selectedCreatureIndex);
    System.out.println(this.player2.toString());


   //environment if and else statements --> increase strength depening on their best environment 
System.out.println();
    System.out.println("Pick an environment by typing in the corresponding number! (environment may or may not increase strength depening on the creature): ");

    //creating environment 
      Environment.envirTypes myMountain = Environment.envirTypes.MOUNTAINS;
      Environment.envirTypes mySwamp = Environment.envirTypes.SWAMP;
      Environment.envirTypes myForbiddenForest = Environment.envirTypes.FORBIDDEN_FOREST;
      Environment.envirTypes myUnderworld = Environment.envirTypes.UNDERWORLD;
  
    //make array of environment to number
      ArrayList<Environment.envirTypes> availableEnvir = new ArrayList<Environment.envirTypes>();  
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
      System.out.println(String.format("Environment is %s", availableEnvir.get(selectedEnvirIndex)));

    //adjusting strength depending on environment 

  
    //stating the battle will start 
    System.out.println();
    System.out.println("Ready for battle? Alright fight!");
    System.out.println("-".repeat(70));


    // Start the battle rounds, continue until one is defeated
    int round = 1;
    while (!this.isGameOver()) {
      // Display game status
      this.updateGameStatus(round);
      this.pause();
      void engageFight();
  
      // Move to the next round of combat
      round++; 
      }
       
     }
      void engageFight() {
      //decide who gets to go first 
      int diceRoll = (int) ((6*Math.random())+1);
      if(diceRoll <= 3){
        this.performBattle(this.player1, this.player2);
      }
      else{
        this.performBattle(this.player2, this.player1);
      }
    }

    //perform battle 
      void performBattle(Creature p1, Creature p2) {
         System.out.println(String.format("%s is attacking %s", p1.species(), p2.species()));
        p1.inflictDamageTo(p2);
     
    }
      

   // Determine if the game is over
  boolean isGameOver() {
    if (this.player1.isDefeated()) {
      System.out.println(String.format("%s is defeated! %s won the fight!", this.player1.species(), this.player2.species()));
      return true;
    } else if (this.player2.isDefeated()) {
      System.out.println(String.format("%s is defeated! %s won the fight!", this.player2.species(), this.player1.species()));
      return true;
    }
      return false;
  }


    //battle begins, reload each creature and health for each round
      void updateGameStatus(int round) {
      System.out.println(String.format("Round %d:", round));
      System.out.println(String.format("%s: %d hp | %s: %d hp", this.player1.species(), this.player1.getHealth(), this.player2.species(), this.player2.getHealth()));
      System.out.println("-".repeat(70));
      
    }
    //slows down the display being outputted
     void pause() {
    this.pause(1000);
  }
   void pause(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (Exception a) {
      System.out.println(a.toString());
    }
  }
}     

  

      
