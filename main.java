
public class Main {

    public static void main(String[] args) {

        //displaying title and info about game 
        System.out.println("Harry Potter Magical Creatures Battle!");
        System.out.println("-".repeat(93));

        System.out.println("Play against yourself/another person and choose the best mythical creature to win the battle! ");

        System.out.println("Choose your magical creature to use for battle!");
        System.out.println("-".repeat(93));
        //list of creatures
        System.out.println("Troll");
        System.out.println("Dragon");
        System.out.println("Hippogriff");
        System.out.println("Unicorn");
        System.out.println("Cerberus");
        System.out.println("Mandrake");

//user input
    System.out.println();
    Scanner myObj = new Scanner(System.in);
    
    String creatureName1;
    // Enter first creature and press Enter
    System.out.println("Enter first creature: "); 
    creatureName1 = myObj.nextLine();   
       
    System.out.println("Chosen creature 1: " + creatureName1); 
       System.out.println();
    
  
  //print out description of chosen creature
    if (creatureName1 == dragon){
        System.out.println(description of dragon); //continue for the rest of the animals and also do the same for creatureName2
    }

  
    String creatureName2;
    // Enter second creautre and press Enter
    System.out.println("Enter second creature: "); 
    creatureName2 = myObj.nextLine();   
       
    System.out.println("Chosen creature 2: " + creatureName2);
    


    //environment if and else statements --> increase strength depening on their best environment 

    String chosenEnvir;
    System.out.println("Choose the environment (mountains, swamp, forbidden_forest, underworld): ";
    chosenEnvir = myObj.nextLine();

    system.out.println("Environment is " + chosenEnvir);

    if (chosenEnvir == mountains);
        int.strength(Dragon) += 10;
        int.strength(Troll) += 10;

    
    if (chosenEnvir == swamp);
        int.strength(Mandrake) += 10;

    if (chosenEnvir == forbidden_forest);
        int.strength(Hippogriff) += 10;
        int.strength(Unicorn) += 10;

    if (chosenEnvir == underworld);
        int.strength(ThreeHeadedDog) += 10;
       

    //ask if ready to battle 
    String readyBattle;
    System.out.println("Ready for battle? (yes): ";
    readyBattle = myObj.nextLine();
    system.out.println("Fight!")


    //battle begins, load each decrease of health 

    

    //show the winner who does not have a health of zero first 
}