public class Hippogriff extends Creature{

    public String species() {
        return "Hippogriff"; 
    }

    public String description () {
        return " A magical beast that has the front legs, wings, and head of an eagle and the body, hind legs, and tail of a horse. Hippogriffs are carnivores and are extremely dangerous to be tamed. \nStrengths: quick reactions, loyal, independent \nWeaknesses: a bit too independent and have a hard time trusting others";
    }


    public int health() {
        return 220;
    }

    public int strength() {
        return 20;
    }


     public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.FORBIDDEN_FOREST;
    }

   
}