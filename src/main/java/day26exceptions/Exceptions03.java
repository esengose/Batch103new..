package day26exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d);


    }

    //Stringteki karakter sayısını bulunuz, int eçeviriniz. sonrada inti karakter sayısına bölünüz


    public static double divideStringByTheNumOfTheChar(String str) {
        int length = str.length();
        int i = Integer.valueOf(str);
        return i / length;
    }                           //1.yol
    /*public static double divideStringByTheNumOfTheCharacter(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

}
int length = 0;
    int i = 0;                                  //2.yol
    double sonuc = 0;
    try {

        length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
        i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
        sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    return sonuc;
}                                   //3.yol
public static double divideStringByTheNumOfTheCharacters(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

        }catch(NullPointerException e){
            System.out.println("NullPointer'a ozel...");
        }catch(Exception e){
            System.out.println("Diger tum Exception'lar icin...");
        }
        return sonuc;
     */
}