public class Troll extends Creature {

    public String species() {
        return "Troll"; 
    }

    public String description () {
        return "A large magical beast of prodigious strength and immense stupidity \nStrengths: strong and big \nWeaknesses: lack of intelligence";
    }

    public int health() {
        return 100;
    }

    public int strength() {
        return 15;
    }

       public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.MOUNTAINS;
       }

    
}