package practice.javapro.march_6_2023;

public class Snake extends Animal{


    public Snake(String animalName, int numberOfLegs, String mainColor) {
        super(animalName, numberOfLegs, mainColor);
    }

    void eat(){
        System.out.println("snake eats");
    }
    void makeNoise(){
        System.out.println("snake makes some noise");
    }
    void walk(){
        System.out.println("snake walks");
    }

}
