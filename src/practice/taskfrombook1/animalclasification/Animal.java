package practice.taskfrombook1.animalclasification;

public class Animal {

    private int size;
    String name;
    protected String breed;
    public int numOfLegs = 4;

    void walk(){
        System.out.println("animal гуляет");
    }
    public void eat(){
        System.out.println("animal кушает");
    }
    void sleap(){
        System.out.println("animal спит");
    }
    void makeNoise(){
        System.out.println("animal разговаривает");
    }

    Animal obj = new Animal();


    public int getSize() {
        return size;


    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
