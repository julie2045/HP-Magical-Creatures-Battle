public class Hippogriff extends Creature{

    public String species() {
        return "Hippogriff"; 
    }

    public String description() {
        return " A magical beast that has the front legs, wings, and head of an eagle and the body, hind legs, and tail of a horse. Hippogriffs are carnivores and are extremely dangerous to be tamed.";
    }
    
    public String strength() {
        return "Strengths: quick reactions, loyal, independent.";
      }
  
    public String weakness() {
        return "Weaknesses: a bit too independent and have a hard time trusting others.";
      }

    public int getHealth() {
        return this.health + 120;
    }

    public int damage() {
        return 20;
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