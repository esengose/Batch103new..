package day15Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binarysearch() metodu kulllanarak bir elemanın array de olup olmadığını anlarız

        int arr[]={12,43,31,14};
        int sayi=43;
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr,sayi);
        System.out.println(idx);

        int sayi2= 58;
        Arrays.sort(arr);
        int idxx= Arrays.binarySearch(arr,sayi2);
        System.out.println(idxx); // binary search de - görmek, yok demektir, olsaydı hangi sırada olurdu, - o değeri verir.

        // Aradığını zeleman Array de yoksa, -a şeklinde bir negatif sayı alınır, bu eleman array de yok demektir.
        //a nın anlamı, olsaydı, kaçıncı sırada olurdu, demektir. Sıra numarası, index değil.
        // binary search metodu, tekrarlayan elemanlar için kullanılmaz.
    }
}
