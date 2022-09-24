public class ArithmetischeOperationen {

    /**
     * Ausführung aller arithmetischen Operationen inkl. Ausgabe
     * @param args
     */
    public static void main(String[] args) {

        //Deklaration und Initialisierung
        int a = 8;
        int b = 4;

        //Ausgabe
        System.out.println("Ergebnis Addition:" + (a + b));
        System.out.println("Ergebnis Subtraktion:" + (a - b));
        System.out.println("Ergebnis Multiplikation:" + (a * b));
        System.out.println("Ergebnis Division:" + (a / b));
        System.out.println("Ergebnis Modulo-Rechnung:" + (a % b));

        // Typumwandlung (cast)
        // double div = a / (1.0 * b);
        double div = (double) a / (double) b;
        System.out.println("div = " + div);
    }
}
