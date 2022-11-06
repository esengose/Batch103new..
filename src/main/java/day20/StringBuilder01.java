package day20;

public class StringBuilder01 {
    public static void main(String[] args) {

/*
    1)"StringBuilder" Java'da bir Class'dır
    2)"StringBuilder", String oluşturmaya yarar
    3)"String" Class varken niçin "StringBuilder"a ihtiyaç duyarız?
       Çünkü "String" Class "Immutable Class"dır, ama bazen biz "Mutable String" lere ihtiyaç duyarız.
       StringBuilder bize "Mutable String" verir.
 */
        String str="Java";
        //str="super java"; diyemeyiz, değişmez



        StringBuilder strb=new StringBuilder("Java");
        strb=new StringBuilder("Super Java");
        // orjinal değeri başka string oluşturmadan değiştirebiliriz

/*
    1)"StringBuilder" Java'da bir Class'dır
    2)"StringBuilder", String oluşturmaya yarar
    3)"String" Class varken niçin "StringBuilder"a ihtiyaç duyarız?
       Çünkü "String" Class "Immutable Class"dır, ama bazen biz "Mutable String" lere ihtiyaç duyarız.
       StringBuilder bize "Mutable String" verir.
    4)"Immutable Class" larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
         i)Memory'de yeni bir variable yeni değerle oluşturulur
         ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.
         iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

         "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.
 5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
        Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
        kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
        etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
        degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
        yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.*/

        //STRINGBUILDER NASIL OLUŞTURULUR?      1.YOL**

        StringBuilder stb=new StringBuilder("Java");
        System.out.println(stb);
                                                //2.YOL**
        StringBuilder stb2=new StringBuilder();
        stb2.append("java");
        stb2.append("is");
        stb2.append("easy");
        stb2.append("!!!");
        System.out.println(stb2);

        stb2.append("dgklşs").append("fgjkmksf").append("lfgjkls"); //method chain
        System.out.println(stb2);

        //stringbuilderlar da karakter sayıları nasıl bulunur?
        StringBuilder stb3=new StringBuilder();
        stb3.append("cat");
        stb3.append("xxxxxxxxxx");

        int num=stb3.length();
        System.out.println(num);

        int capacity= stb3.capacity();
        System.out.println(capacity);




















    }
}
