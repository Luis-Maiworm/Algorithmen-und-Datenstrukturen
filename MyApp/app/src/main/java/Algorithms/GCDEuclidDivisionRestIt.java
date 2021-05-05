package Algorithms;

public class GCDEuclidDivisionRestIt {

    public int calc(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }


}
