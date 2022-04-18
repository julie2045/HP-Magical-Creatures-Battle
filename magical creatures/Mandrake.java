public class Mandrake extends Creature{

    public String species() {
        return "Mandrake"; 
    }

    public String description () {
        return "A magical and sentient plant. The root of the plant looks like a baby human and matures as it grows. When matured, its cry can be fatal to anyone who hears it. \nStrengths: it’s cry can hurt anyone who hears it, use it in healing potions \nWeaknesses: fire and ice";
    }


    public int health() {
        return 115;
    }

    public int strength() {
        return 15;
    }


    public String bestEnvir() {
        return "Swamp";
    }

    //stock keeping unit
    public String sku() {
        return "tro0001";

    }
}