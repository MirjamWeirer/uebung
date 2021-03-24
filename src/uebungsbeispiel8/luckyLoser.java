package uebungsbeispiel8;

import java.util.Arrays;

public class luckyLoser {
    /*
        Erstellen Sie eine Methode luckyLooser die zwei Arrays mit Namen als Parameter erhält. Im ersten
        Array sind all jene Personen die im ersten Gewinnspiel nichts gewonnen haben und im zweiten Array
        all jene Namen die beim zweiten Gewinnspiel nichts gewonnen haben. Alle jene die weder im ersten
        noch im zweiten Gewinnspiel etwas gewonnen haben erhalten einen Trostpreis. Der Rückgabewert
        soll ein Array mit den Namen der Trostpreis GewinnerInnen sein. (Das Array soll so lang sein wie der
        Größere der beiden Parameter)
     */
    public static void main(String[] args) {
        String [] nichtGewonnen1 = {"Mirjam Weirer", "Julia Rein", "Anna Haim"};
        String [] nichtGewonnen2 = {"Jasmin Feigel", "Mirjam Weirer", "Julia Rain"};
        System.out.println(Arrays.toString(luckyLooser(nichtGewonnen1,nichtGewonnen2)));

    }

    public static String[] luckyLooser(String[] gewinnspiel1, String[] gewinnspiel2) {
        String[] trostpreis = new String[gewinnspiel1.length + gewinnspiel2.length];
        for (int i = 0; i < trostpreis.length; i++) {
            if (!gewinnspiel1.equals(gewinnspiel2)) {
                trostpreis = gewinnspiel1;
                trostpreis = gewinnspiel2;

            }
        }
        return trostpreis;
    }
}
