package uebungsbeispiel8;

import java.util.Arrays;

public class smartphoneSales {
    /*
        Als Mobilfunkbetreiber sind Sie daran interessiert wie viele neue Smartphones in einer Zeitperiode
        verkauft werden. Erstellen Sie die Methode smartphoneSales - Als Parameter erhalten Sie ein
        zweidimensionales Array, wobei jede Zeile so aufgebaut ist: erste Zahl ist eine ganzzahlige ID die für
        ein Handymodell steht, zweite Zahl die Anzahl verkauften Telefone mit der ID
        1, 50 (Smartphone mit Nummer 1, 50 Stück)
        2, 40
        1, 60
        Sie sollen diese Daten zusammenfassen und ein zwei dimensionales Array zurückliefern, welches die
        Verkaufszahlen für jedes Handy aggregiert. Also beispielsweise
        [[1, 110],
        [2, 40]]
     */
    public static void main(String[] args) {
        int [][] smartphone={{1,50},{2,40},{1,60},{3,30}};

        printMatrix(smartphoneSales(smartphone));
    }

    public static int[][]  smartphoneSales(int [][]smartphone){
        int [][] sumSaleSmartphone = smartphone;
        for (int row = 0; row < sumSaleSmartphone.length; row ++){
                int sum = smartphone[row][1];
            for (int col = row + 1; col < sumSaleSmartphone[row].length;col++){
                if (sumSaleSmartphone[row][0]==sumSaleSmartphone[col][0]){
                    sum += sumSaleSmartphone[col][1];
                    sumSaleSmartphone[col][0]=0;
                    sumSaleSmartphone[col][1]=0;
                }
            }
        sumSaleSmartphone[row][1]=sum;
        }
        return rightSize(sumSaleSmartphone);
    }
    public static void printMatrix (int [][] arr){
        for (int zeile = 0; zeile < arr.length; zeile++){
            for (int reihe = 0; reihe < arr[zeile].length; reihe++){
                System.out.print(arr[zeile][reihe] +"\t");
            }
            System.out.println();
        }
    }
    public static int[][] rightSize(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != 0) {
                counter++;
            }
        }

        int[][] array_without_zeros = new int[counter][2];
        counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != 0) {
                array_without_zeros[counter] = array[i];
                counter++;
            }
        }

        return array_without_zeros;
    }
}
