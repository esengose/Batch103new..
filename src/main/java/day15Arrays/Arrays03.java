package day15Arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Bir String teki sesli harflerin sayısını bulan kodu yazınız.
        //a-e-i-o-u-A-E-I-O-U
        String str= "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        String harfler[]=str.split("");
        str=str.toLowerCase();
        int counter=0;
        System.out.println(Arrays.toString(harfler));
        for( String w: harfler) {

            switch (w) {
                case "a":
                    counter++;
                    break;
                case "e":
                    counter++;
                    break;
                case "i":
                    counter++;
                    break;
                case "o":
                    counter++;
                    break;
                case "u":
                    counter++;
                    break;
            }
        }
        System.out.println(counter); }

}




