public abstract class Creature {
    
    public abstract String species();

    public abstract String description();

    public abstract String strength();

    public abstract String weakness();

    int health = 100;
    public int getHealth(){
      return this.health;
    }

    public void setHealth(int level) {
    this.health = level;
   }

    public abstract int damage();
    
    public boolean isDefeated() {
    return this.health < 10;
    }
    public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealth();
    target.setHealth(targetHealth - this.damage());
      }

    public  abstract Environment.envirTypes bestEnvir();

    //form sentence for information about each creature
    public String toString() {
      return String.format("%s \n%s \n%s \n%s", this.species(), this.description(), this.strength(), this.weakness());
    }

}