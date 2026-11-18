public class VirtualPet {
    private String name;
    private int energy;
    private int happiness;
    private int weight;
    private int ageY;
    private int ageM;

    public VirtualPet(String name){
        this.name = name;
        weight = 5;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return name + " 's information: \n" + "Energy: " + energy + "\n" + "Happiness: "
                + happiness + "\n" + "Weight: " + weight + "\n"
                + "Age: " + ageM + " months" + " " + ageY + " years";
    }
    public void feed(){
        if(energy < 10){
            energy++;
        }
        else{
            weight++;
        }
    }

    public int getEnergyLevel() {
        return energy;
    }

    public int getHappinessLevel() {
        return happiness;
    }
    public void play(){
        if(happiness < 10 ){
            happiness++;
        }
        if(weight > 5){
            weight--;
        }
    }
    public void updateStatus(){
        if(happiness > 10 ){
            happiness--;
        }
        if(energy > 10){
            energy--;
        }
        if(ageM == 12){
            ageM = 0;
            ageY++;
        }
    }
}
