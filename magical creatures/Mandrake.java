public class Mandrake extends Creature{

    public String species() {
        return "Mandrake"; 
    }

    public String description() {
        return "A magical and sentient plant. The root of the plant looks like a baby human and matures as it grows. When matured, its cry can be fatal to anyone who hears it.";
    }
    
    public String strength() {
        return "Strengths: its cry can hurt anyone who hears it, use it in healing potions.";
    }

    public String weakness() {
        return "Weaknesses: fire and ice.";
    }

     public int getHealth() {
        return this.health + 15;
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
        return Environment.envirTypes.SWAMP;
    }

   
}