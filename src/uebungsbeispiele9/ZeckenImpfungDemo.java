package uebungsbeispiele9;

public class ZeckenImpfungDemo {
    public static void main(String[] args) {
       /*
            Funktion naechsteZeckenImpfung liefert zurück in welchem Jahr man die nächste Zecken
            Auffrischungsimpfung durchführen soll. Als Parameter gibt man das alter an, mit
            letztesImpfungsJahr, wann man das letzte mal geimpft wurde, und mit dem boolean
            ersteAuffrischung ob es sich um die erste Auffrischung handelt.
            Die nächste Auffrischung ist nach 3 Jahren fällig falls es die erste Auffrischung oder man mindestens
            60 Jahre alt ist – ansonsten 5 Jahre später.
        */
        System.out.println("Auffrischung im Jahr: " + nextZeckenImpfung(20, 2018,false));
        System.out.println("Auffrischung im Jahr: " + nextZeckenImpfung(65, 2018,false));
        System.out.println("Auffrischung im Jahr: " + nextZeckenImpfung(10, 2018,true));
        System.out.println("Auffrischung im Jahr: " + nextZeckenImpfung(15, 2020,true));
    }
    public static int nextZeckenImpfung(int age, int lastImpfung,boolean firstAuffrischung){
        int year = 0;
        if (firstAuffrischung == true || age >= 60){
            year = lastImpfung +3;
        }
        else{
            year = lastImpfung +5;
        }
        return year;
    }
}
