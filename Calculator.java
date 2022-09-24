public class Calculator {

    /**
     * Kleiner Taschenrechner zum Addieren zweier Zahlen
     * @author igor
     * @version 1.0
     * @param args Argumente für Programmaufruf
     * @return Rückgabewert
     */
    public static void main(String[] args) {
        //Variablen deklarieren und initialisieren
        String calculatorName = "firstCalculator";
        double numberOne = 4.15;
        double numberTwo = 3.50;
        double result = 0;

        //Addition
        result = numberOne + numberTwo;

        //STRG + ALT + v --> variable automatisch erzeugen
        double v = numberOne + numberTwo;

        //soutv wie sout, aber mit variable zum auswählen
        System.out.println("v = " + v);

        //Ausgabe
        System.out.println("Name des Rechners: " + calculatorName);
        System.out.println("Zahl 1: " + numberOne);
        System.out.println("Zahl 2: " + numberTwo);
        System.out.println("Ergebnis der Addition: " + result);
    }
}
