package practice.javapro.march_6_2023;

public class Cat extends Animal{


    public Cat(String animalName, int numberOfLegs, String mainColor) {
        super(animalName, numberOfLegs, mainColor);
    }

    void eat(){
        System.out.println("cat eats");
    }
    void makeNoise(){
        System.out.println("cat makes some noise");
    }
    void walk(){
        System.out.println("cat walks");
    }

}
