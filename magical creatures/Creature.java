public abstract class Creature {
    
    public abstract String species();

    public abstract String description();

    public abstract String strength();

    public abstract String weakness();

    public abstract int health();

    public abstract int damage();

    public  abstract Environment.envirTypes bestEnvir();

    //form sentence for information about each creature
    public String toString() {
      return String.format("%s \n%s \n%s \n%s", this.species(), this.description(), this.strength(), this.weakness());
    }

}