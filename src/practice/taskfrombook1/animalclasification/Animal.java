package practice.taskfrombook1.animalclasification;

public class Animal {

    private int size;
    String name;

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

}
