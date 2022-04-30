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
    public int getHealth() {
        return this.health;
    }

    public int damage() {
        return 15;
    }

    @Override
    public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealth();
    target.setHealth(targetHealth - 15);
    }

    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.MOUNTAINS;
       }

    
}