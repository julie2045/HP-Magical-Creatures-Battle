public class Troll extends Creature {

    public String species() {
        return "Troll"; 
    }

    public String description() {
        return "A large magical beast of prodigious strength and immense stupidity.";
    }

    public String strength() {
        return "Strengths: strong and big.";

    }
   
    public String weakness() {
        return "Weaknesses: lack of intelligence.";
    }
    public int health() {
        return 100;
    }

    public int damage() {
        return 15;
    }

       public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.MOUNTAINS;
       }

    
}