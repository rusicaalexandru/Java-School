package numere;

public class rational {

    private int m;
    private int n;

    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }
    public void setM(int m) {
        this.m = m;
    }
    public void setN(int n) {
        this.n = n;
    }

    public rational(int m, int n) {
        if (n != 0) {
            int d = cmmdc(m, n);
            this.m = m / d;
            this.n = n / d;
        } else System.out.println("Numitorul este nul!");
    }
    public rational mul(rational r) {
        return new rational(m * r.m, n * r.n);
    }
    static int cmmdc(int m, int n) {
        if (n != 0) return cmmdc(n, m % n);
        else return m;
    }
    public rational add(rational r) {
        return new rational(m * r.n + r.m * n, n * r.n);
    }
    public rational sub(rational r) {
        return new rational(m * r.n - r.m * n, n * r.n);
    }
    public rational div(rational r) {
        if (r.m != 0) {
            return new rational(m * r.n, n * r.m);
        } else return new rational(0, 1);
    }
    boolean maiMare(rational r) {
        return (double) m / n > (double) r.m / r.n;
    }
    boolean maiMic(rational r) {
        return (double) m / n < (double) r.m / r.n;
    }
    boolean egal(rational r) {
        return (double) m / n == (double) r.m / r.n;
    }

    class Rvector{
        public String suma(rational arr[]){
            rational sum = new rational(0, 1);
            for (int i = 0; i < arr.length; i++){
                sum = sum.add(arr[i]);
            }
            return sum.toString();
        }

        public rational[] sort(rational arr[]){
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length; j++){
                    if(arr[j].maiMare(arr[j + 1])){
                        rational r = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = r;
                    }
                }
            }
            return arr;
        }
    }
}