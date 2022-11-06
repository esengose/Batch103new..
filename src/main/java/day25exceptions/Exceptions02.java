package day25exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
        String arr[] = {"Ali", "Can", "Veli", "Han"};
        getElementFromArray(arr, 4);


    }

    //Bir String arrayden index girerek eleman elde etmek için bir method oluştuurn
    public static void getElementFromArray(String arr[], int idx) {
        try {
            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.getMessage();    teknik mesajlar verir
            //e.printStackTrace();  teknik mesajlar verir
            System.err.println("Arrayde bir hata oluştu");  //teknik olmayan açıklama
        }
    }


}
