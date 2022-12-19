package Practice;

public class StepenDvojki {
    public static void main(String[] args) {
        // создать алгоритм выведения 2 в степени
        int num1=34;
        int res;
        int i;
        for (i=0; i<num1; i++){
            res=1;
            int a = i;
            while (a>0){
                res *= 2;
                a--;
            }
            System.out.println("2 в степени "+ (i) + " это " + res);
        }
    }
}
