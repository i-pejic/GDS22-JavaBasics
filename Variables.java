public class Variables {
    //Erstellung des Einstiegspunkts
    public static void main(String[] args) {
        //Variablen Deklaration
        String firstName;
        int a, b, c;

        //Variablen Initialisierung
        firstName = "Igor";
        a = 1;
        b = 2;
        c = 3;

        //Variablen Deklaration + Initialisierung
        char t = 'a';
        int x = 1, y = 2, z = 3;

        //Variablen Wert ändern
        firstName = "Max";

        //var
        var test = firstName;
        //STRG + Shift + F6 -> Type Migration von var auf entsprechenden Datentypen

        var doub = 4000;

        System.out.println(firstName);
    }
}
