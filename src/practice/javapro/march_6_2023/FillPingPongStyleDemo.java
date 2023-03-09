package practice.javapro.march_6_2023;

public class FillPingPongStyleDemo {
    public static void main(String[] args) {
        FillArrayPingPong obj = new FillArrayPingPong(new int[6][13],2,3);
        obj.fillArrayPingPongStyle();
        obj.printArray();
    }
}
