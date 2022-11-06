package day15Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Size verilen pozitif ver negatif sayılar içeren bir integer arraydeki en büyük ne gatif ve en küçük pozitif elemanı bulnuz

        int arr[] ={-12,18,-5,23,-2,0};
        Arrays.sort(arr); // (-12,-5,-2,0,18,23) oldu
        int maxnegative = arr[0];
        int minpositive= arr[arr.length-1];
        for (int w : arr) {
            if (w < 0) {

                maxnegative = Math.max(maxnegative, w);
            }

            if (w > 0) {
                minpositive = Math.min(minpositive, w);
            }
        }
        System.out.println(maxnegative +" and " + minpositive);

        //hoca yaparken sonuç -5 ve 18 çıktı, burda sonuç -2 ve 18 çıktı?????? bir daha çöz


















    }
}
