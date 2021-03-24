package uebungsbeispiele9;

public class powerDemo {
    public static void main(String[] args) {
        /*
            Erstellen Sie eine KlassePower und implementieren Sie die Potenz auf zwei unterschiedliche Arten.
            public static int powerSimple(int x, int n)
            wobei x die Basis ist und n eine positiver Exponent sein muss. x^n -> x * x * x *x (n mal)
            Implementieren Sie eine rekursive Implementation der Potenzfunktion, wobei folgender Zusammenhang gilt:
            potenz(x, n) = potenz (x, n / 2) * potenz (x, n / 2);            // falls n gerade
            potenz (x, n) = x * potenz (x, n / 2) * potenz (x, n / 2);    // falls n ungerade
         */
        System.out.println(powerSimple(2,4));
        System.out.println(powerSimple(2,3));
    }
    public static int powerSimple(int x, int n) {
        if (n % 2 == 0) {
            return  x = n/2 * n/2;

        }
        else return  x = x * n/2 * n/2;


        if (x<=n){
            x++;
            powerSimple(x,n);
        }
    }

}
