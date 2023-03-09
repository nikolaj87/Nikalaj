package javatasks.march_6_2023;

class Animal {

    private String animalName;
    private int numberOfLegs;
    private String mainColor;

    public Animal(String animalName, int numberOfLegs, String mainColor) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.mainColor = mainColor;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }


    void eat(){
        System.out.println("animal eats");
    }
    void makeNoise(){
        System.out.println("animal makes some noise");
    }
    void walk(){
        System.out.println("animal walks");
    }
}
