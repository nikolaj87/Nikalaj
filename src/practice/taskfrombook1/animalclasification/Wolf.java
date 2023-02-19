package practice.taskfrombook1.animalclasification;

public class Wolf extends Canine implements ToyAnimal {



    boolean playWithChildren = false;

    void makeNoise(){
        System.out.println("wolf зарычал");
    }

    public void eat(){

    }

    public void makeGoodNoise(){
        System.out.println("я наследую интерфейс");
    }

    public void demo(){
        Wolf vally = new Wolf();
        ToyAnimal obj = vally;

        obj.makeGoodNoise();
        vally.makeGoodNoise();
        int a = price;
        System.out.println(a);
    }

}
