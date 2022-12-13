public class Cats {
    String name;
    Boolean goodcat;
    Integer age;

    public Cats(String name, Boolean goodcat, Integer age) {
        this.name = name;
        this.goodcat = goodcat;
        this.age = age;
    }

    public void say (String miy){
        System.out.println("Cat says " + miy);
    }

    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", goodcat=" + goodcat +
                ", age=" + age +
                '}';
    }
}
