package AllHomeTasks.Hometask2.Task21;

class Dog {

    String name;
    Integer age;
    String color;

    public Dog(final String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void happyBirthday(){
        this.age ++;
    }
    public void voice(){
        System.out.println("name: " + this.name +
                ", " + this.age + " year(s), "
                    + this.color + " color");
    }


}
