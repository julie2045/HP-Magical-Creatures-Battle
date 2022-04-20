import java.util.Scanner; // import the Scanner class 
import java.util.ArrayList; // import the ArrayList class

public class Main {

    public static void main(String[] args) {

        //displaying title and info about game 
        System.out.println("Harry Potter Magical Creatures Battle!");
        System.out.println("-".repeat(93));

        System.out.println("Play against yourself/another person and choose the best mythical creature to win the battle! ");

        System.out.println("Choose your magical creature to use for battle!");
        System.out.println("-".repeat(93));
         
     //creating the creatures 
        var myDragon = new Dragon();
        var myHippogriff = new Hippogriff();
        var myMandrake = new Mandrake();
        var myThreeHeadedDog = new ThreeHeadedDog();
        var myTroll = new Troll();
        var myUnicorn = new Unicorn();

    //make array of creatures to number
      ArrayList<String> Creat = new ArrayList<String>();  
        Creat.add("Dragon (0)");
        Creat.add("Hippogriff (1)");
        Creat.add("Mandrake (2)");
        Creat.add("ThreeHeadedDog (3)");
        Creat.add("Troll (4)");
        Creat.add("Unicorn (5)");
        System.out.println(Creat);


//user input
    System.out.println();
    Scanner myObj = new Scanner(System.in);
    
    String creatureName1;
    // Enter first creature and press Enter
    System.out.println("Enter first creature using the corresponding number that belongs to the creature you want: "); 
    creatureName1 = myObj.nextLine();   

  
  //print out description of chosen creature
    if (creatureName1.equals("0")){
            System.out.println("Dragon: " + myDragon.description()); 
        } 

    else if (creatureName1.equals("1")){
            System.out.println("Hippogriff: " + myHippogriff.description()); 
        } 
    
    else if (creatureName1.equals("2")){
            System.out.println("Mandrake: " + myMandrake.description()); 
        } 
    
    else if (creatureName1.equals("3")){
            System.out.println("ThreeHeadedDog: " + myThreeHeadedDog.description()); 
        } 

    else if (creatureName1.equals("4")){
            System.out.println("Troll: " + myTroll.description()); 
        } 
    else if (creatureName1.equals("5")){
            System.out.println("Unicorn: " + myUnicorn.description()); 
        } 
  
  

  
    String creatureName2;
    // Enter second creature and press Enter
    System.out.println();
    System.out.println("Enter second creature: "); 
    creatureName2 = myObj.nextLine();   
       
    
  //print out description of chosen creature
    if (creatureName2.equals("0")){
            System.out.println("Dragon: " + myDragon.description()); 
        } 

    else if (creatureName2.equals("1")){
            System.out.println("Hippogriff: " + myHippogriff.description()); 
        } 
    
    else if (creatureName2.equals("2")){
            System.out.println("Mandrake: " + myMandrake.description()); 
        } 
    
    else if (creatureName2.equals("3")){
            System.out.println("ThreeHeadedDog: " + myThreeHeadedDog.description()); 
        } 

    else if (creatureName2.equals("4")){
            System.out.println("Troll: " + myTroll.description()); 
        } 
    else if (creatureName2.equals("5")){
            System.out.println("Unicorn: " + myUnicorn.description()); 
        } 

    }
}
    //environment if and else statements --> increase strength depening on their best environment 


       

    //ask if ready to battle 
    String readyBattle;
    System.out.println("Ready for battle? (yes): ";
    readyBattle = myObj.nextLine();
    system.out.println("Fight!")


    //battle begins, load each decrease of health 

    

    //show the winner who does not have a health of zero first 
}