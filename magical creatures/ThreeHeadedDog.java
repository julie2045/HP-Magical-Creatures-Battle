public class ThreeHeadedDog extends Creature{

    public String species() {
        return "Three-Headed Dog"; 
    }

    public String description() {
        return " Extremely large three-headed dog who guards the trapdoor that hides the Philosopher's Stone. Fluffy is extremely loyal to Hagrid and is based off of Cerberus who is a three-headed dog that guards the gate to the underworld in Greek mythology.";
    }

    public String strength() {
        return "Strengths: speed, teeth, three heads who can communicate with each other and coordinate an attack.";
    }

    public String weakness() {
        return "Weakness: put to sleep by music.";
    }

     public int getHealth() {
        return this.health;
    }


    public int damage() {
        return 25;
    }
    
    @Override
    public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealth();
    target.setHealth(targetHealth - 25);
    }

    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.UNDERWORLD;
    }

   
}