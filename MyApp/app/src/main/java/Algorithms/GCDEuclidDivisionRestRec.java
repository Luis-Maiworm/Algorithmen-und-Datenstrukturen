package Algorithms;

public class GCDEuclidDivisionRestRec {

    public int calc(int a, int b){
        if (b == 0) {
            return a;
        }
        else {
            return calc(b, a%b);
        }
    }
}
