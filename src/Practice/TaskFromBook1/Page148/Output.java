package Practice.TaskFromBook1.Page148;

public class Output {
    public static void main(String[] args) {
//                Output o = new Output();
//        o.go();
        char num = 'a';
        for (int i = 0; i < 10; i++) {

            int num2 = num;
        System.out.println(num2 + " " + num);
        num++;
    }




    }

    void go(){
        int y = 7;
        for (int i = 1; i <8 ; i++) {
            y++;
            if (i>4) {
                System.out.print(++y + " ");
            }
            if (y>14){
                System.out.println(" x = " + i);
                break;
            }
            System.out.println(i + " " + y);
        }
    }

}
