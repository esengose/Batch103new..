package day25exceptions;

public class Exception01 {
    public static void main(String[] args) {
        //Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.
//1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method
// isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.
//2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir
// try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda
// Javanin ne yapmasini istedigimizi yazabiliriz
        divide(6, 2);//3
        divide(0, 2);//0
        divide(6, 0);//exception Bir sayı matematikte sıfır ile bölünemez
// divide2(5,0);
        divide2(12, 0);
    }

    //1. Yol Tavsiye edilmez.
    //Bir developer icin tüm matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez");
        } else {
            System.out.println(a / b);
        }
    }

    //2. Yol try-catch kullanarak exception'ı handle etmek tavsiye edilir.
    public static void divide2(int a, int b) {

        try {
            System.out.println(a / b);
            System.out.println("hi exception");
            System.out.println("bye exception");

        } catch (ArithmeticException e) {
            System.out.println("Bolme isleminde bir problem olustu");
        }
//java matematik ile ilgili karsılasılması muhtemel tum istisnalari, hatalari ArithmeticException class'ina koymustur.
//Matematikteki tüm istisnalari detaylari bilmek zorunda degiliz


    }
}