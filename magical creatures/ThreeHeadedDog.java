public class ThreeHeadedDog extends Creature{

    public String species() {
        return "Three-Headed Dog"; 
    }

    public String description() {
        return " Extremely large three-headed dog who guards the trapdoor that hides the Philosopher's Stone. Fluffy is extremely loyal to Hagrid and is based off of Cerberus who is a three-headed dog that guards the gate to the underworld in Greek mythology. \nStrengths: speed, teeth, three heads who can communicate with each other and coordinate an attack \nWeakness: put to sleep by music ";
    }


    public int health() {
        return 250;
    }

    public int strength() {
        return 25;
    }


    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.UNDERWORLD;
    }

   
}