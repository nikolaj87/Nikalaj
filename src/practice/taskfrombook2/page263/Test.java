package practice.taskfrombook2.page263;

public class Test {
    int a;

    public Test(int a) {
        this.a = a;
    }

    void change(Test a, Test b){
        int temp = a.a;
        a.a = b.a;
        b.a = temp;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                '}';
    }
}
