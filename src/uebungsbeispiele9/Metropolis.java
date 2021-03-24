package uebungsbeispiele9;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println("London isMetropolis: " + isMetropolis(true,8_982_000,0));
        System.out.println("Munich isMetropolis: " + isMetropolis(false,200_000,100.50));
        System.out.println("Viena isMetropolis: " + isMetropolis(true,2_000_000,0));
        System.out.println("Munich isMetropolis: " + isMetropolis(false,50_000_000,1_100.50));
    }
    /*
        Überprüfen ob eine Stadt als Metropole gilt
        basierend auf 3 Eigenschaften
        Stadt gilt als Metropole wenn:
            -> Hauptstadt mit mehr als 100_000 Einwohner
            -> mehr als 200_000 Einwohner und mind 720 Mio. jährliche Steuereinnahmen
     */
    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth){
        if (isCapital == true && inhabitants >= 100_000){
            return true;
        }else if (isCapital == false && inhabitants >= 200_000 && (taxPerPersonAndMonth*12*inhabitants)>=720_000_000){
            return true;
        }
        return false;
    }
}
