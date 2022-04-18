public class Dragon extends Creature{

    public String species() {
        return "Dragon"; 
    }

    public String description () {
        return "Giant winged, fire-breathing reptilian beasts \nStrengths: fly, breathe fire, giant creatures \nWeaknesses: eyes are their weakest point";
    }


    public int health() {
        return 290;
    }

    public int strength() {
        return 30;
    }


    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.MOUNTAINS;
    }
       
    

    
}