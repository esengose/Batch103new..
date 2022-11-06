package day18arraylistspassedbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLKists01 {
    public static void main(String[] args) {
        // Bir Integer Array Listdeki 7 hariç yazdır
        ArrayList<Integer>ages= new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for(Integer w: ages) {
            if (w == 7) {
                continue;
            }
            //w += 2;  //listler böyle update edilmezler
            ages.set(ages.indexOf(w),w+2 );
        }
        System.out.println(ages);

        //Size verilen Array listde 8 ve 8 den önceki tüm elemanları 2 katına çıkarınız

        List<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for(Integer w: nums){
            nums.set(nums.indexOf(w), w*2);
            if (w==8){
                break;
            }
        }
        System.out.println(nums);

        //


















    }
}
