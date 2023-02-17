package practice.taskfrombook2.page244;

class Recursia {
    static int factorRec(int n){
        int result = 0;
        if(n==1) return 1;
        System.out.println("do " + result);
        result = factorRec(n-1);
        System.out.println("posle " + result);
        result = result * n;
        return result;
    }
}
