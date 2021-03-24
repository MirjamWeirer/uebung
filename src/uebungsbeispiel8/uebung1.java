package uebungsbeispiel8;

public class uebung1 {
    //kleinste Zahl in einem array finden und index zurück geben
    public static void main(String[] args) {
        int [] arr = {2,5,3,1};
        System.out.println(findSmallestNumber(arr));
    }
    public static int findSmallestNumber(int[] arr){
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++){
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                }
            }
        }
        return temp;
    }
}
