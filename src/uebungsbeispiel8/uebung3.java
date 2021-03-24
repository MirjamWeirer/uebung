package uebungsbeispiel8;

import java.util.Arrays;

public class uebung3 {
    /*
        Die Methode mittelwerte erhält als Parameter ein zweidimensionales float Array. (-> Parameter).
        Für jede Zeile wird der Mittelwert berechnet und in einem neuen Array gespeichert -> dieses Array
        soll als Rückgabewert zurückgeliefert werden.
        Den arithmetische Mittelwert erhält man wenn man die aufsummierten Werte durch die Anzahl der
        Elemente dividiert.
     */
    public static void main(String[] args) {
        float[][] arr ={{1.0f,2f,3.6f,4f},{5.7f,6.2f,7f,8f},{9.4f,1f,2f,3f},{4f,5.3f,6f,7f}};
        System.out.println(Arrays.toString(average(arr)));
    }
    public static float[] average(float[][] array) {
        float[] averages = new float[array.length];

        for (int i = 0; i < array.length; i++) {
            float sum_in_row = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum_in_row += array[i][j];
            }
            averages[i] = (sum_in_row / array[i].length);
        }

        return averages;
    }
}
