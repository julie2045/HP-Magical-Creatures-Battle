public class Unicorn extends Creature{

    public String species() {
        return "Unicorn"; 
    }

    public String description() {
        return "Magical pure-white horses with a single horn on their foreheads.";
    }

    public String strength() {
        return "Strengths: powerful healing properties, magic has no effect on them.";
    }
    
    public String weakness() {
        return "Weaknesses: afraid of loud noises, drawn towards those with pure of heart or spirit.";
    }

    public int damage() {
        return 20;
    }

    public int health() {
        return this.health;
    }

    @Override
    public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealth();
    target.setHealth(targetHealth - 20);
    }
  

    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.FORBIDDEN_FOREST;
    }

}