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

    public int health() {
        return 320;
    }

    public int damage() {
        return 20;
    }

    public Environment.envirTypes bestEnvir() {
        return Environment.envirTypes.FORBIDDEN_FOREST;
    }

}