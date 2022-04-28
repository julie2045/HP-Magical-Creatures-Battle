public class Dragon extends Creature{

    public String species() {
        return "Dragon"; 
    }

    public String description() {
        return "Giant winged, fire-breathing reptilian beasts.";
    }

    public String strength() {
        return "Strengths: fly, breathe fire, giant creatures.";
    }

    public String weakness() {
        return "Weaknesses: eyes are their weakest point.";
    }

    public int health() {
       return this.health + 190;
    }

    public int damage() {
        return 30;
    }

    @Override
    public void inflictDamageTo(IDamageable target){
    int targetHealth = target.health();
    target.setHealth(targetHealth - 30);
  }

    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.MOUNTAINS;
    }
       
    

    
}