
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
    
  
    String creatureName2;
    // Enter second creautre and press Enter
    System.out.println("Enter second creature: "); 
    creatureName2 = myObj.nextLine();   
       
    System.out.println("Chosen creature 2: " + creatureName2);
    }
}

