package javatasks.march_6_2023;

public class Dog  extends Animal{



    public Dog(String animalName, int numberOfLegs, String mainColor) {
        super(animalName, numberOfLegs, mainColor);
    }

    void eat(){
        System.out.println("dog eats");
    }
    void makeNoise(){
        System.out.println("dog makes some noise");
    }
    void walk(){
        System.out.println("dog walks");
    }

}
