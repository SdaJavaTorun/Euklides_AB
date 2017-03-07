package sdajava.euklides_ab;

public class Main {

    public static int euk(int a, int b) {

        while (a!=b)
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        return a;
    }

    public static void main(String[] args) {
        int a = 120;
        int b= 20;
        System.out.println("Wynik   " + euk(a,b));
    }
}
