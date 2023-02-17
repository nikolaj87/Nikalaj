package practice.taskfrombook1.animalclasification;

public class Canine extends Animal {

    boolean playWithChildren;

    void walk(){
        super.walk();
        System.out.println("собачьи гуляют в стае");
    }

    public void eat(){
        System.out.println("собачьи кушает");
    }



    public boolean isPlayWithChildren() {
        return playWithChildren;
    }

    public void setPlayWithChildren(boolean playWithChildren) {
        this.playWithChildren = playWithChildren;
    }
}
