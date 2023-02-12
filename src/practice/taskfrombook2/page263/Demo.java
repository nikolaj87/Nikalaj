package practice.taskfrombook2.page263;

public class Demo {
    public static void main(String[] args) {
        Test obj1 = new Test(10);
        Test obj2 = new Test(5);

        obj1.change(obj1, obj2);
        System.out.println(obj1);
        System.out.println(obj2.a);
    }
}
