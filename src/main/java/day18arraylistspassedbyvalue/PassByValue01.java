package day18arraylistspassedbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);
        //static metod olan main metodun içindeki herşey static olmalıdır

        change(5);

        change(x);
        System.out.println(x);
    }
      public static void change (int a){
            System.out.println(a*3);
        }

/*
    1)Java variable'ların orijinal değerlerini korumak ister.
    2)Variable method'lar içinde kullanıldığında, Java method'un içine orijinal değeri koymaz, o değerin kopyasını üretir.
            ve method'a o kopyayı yollar. Method kopya üstünde değişiklik yapar, dolayısıyla variable'ın
            orijinal değer korunmuş olur.
            Bu sisteme "PassByValue" denir.
            Note: Java "Pass By Value" kullanır.
            Note: Bazı programlama dilleri orijinal değeri koruma altına almamıştır. Bu işi developer'lara bırakmıştır.
            Bu tarz diller "Pass By Reference" kullanır.
 */





















}
