package uebungsbeispiel8;

public class uebung2 {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
        printMatrix(arr);
        System.out.println(summGegendiagonale(arr));
    }
    //gibt arr in einer Matrix aus
    public static void printMatrix (int [][] arr){
        for (int zeile = 0; zeile < arr.length; zeile++){
            for (int reihe = 0; reihe < arr.length; reihe++){
                System.out.print(arr[zeile][reihe] +"\t");
            }
            System.out.println();
        }
    }
    //Methode berrechnet die summe auf der Gegendiagonale und liefert den Rückgabewert zurück
    public static int summGegendiagonale (int[][] arr){
        int sum = 0;
        int col = arr.length -1;
        //System.out.println(col);
        for (int row = 0; row < arr.length; row++){
            sum += arr[row][col];
            col --;
        }
        return sum;
    }
}
