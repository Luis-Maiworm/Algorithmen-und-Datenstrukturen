package Algorithms;

public class GCDEuclidSubtractionRec {
    public int calc(int a, int b){
        if (b==0) {
            return a;
        }
        else {
            if (a==0) {
                return b;
            }
            else {
                if (a > b) {
                    return calc(a-b,b);
                }
                else {
                    return calc(a, b-a);
                }
            }
        }
    }
}
