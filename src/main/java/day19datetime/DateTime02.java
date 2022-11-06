package day19datetime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        // Javadan sldığınız date i ay/yıl/gun olarak yazınız

        LocalDate current=LocalDate.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy"); //10 DAN KÜÇÜK AYLARI 01 02 03 DİYE YAZAR
        String formattedDte = dtf.format(current);
        System.out.println(formattedDte);


        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDte2 = dtf2.format(current);
        System.out.println(formattedDte2);

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDte3 = dtf3.format(current);
        System.out.println(formattedDte3);

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("M/dd/yyyy"); //10 DAN KÜÇÜK AYLARI 1,2,3 DİYE YAZAR
        String formattedDte4 = dtf4.format(current);
        System.out.println(formattedDte4);

        DateTimeFormatter dtf5= DateTimeFormatter.ofPattern("MM/d/yy"); //10 DAN KÜÇÜK GÜNLERİ 1,2,3 DİYE YAZAR
        String formattedDte5 = dtf5.format(current);
        System.out.println(formattedDte5);


        //JAVA DAN ALDIĞINIZ TIME IN FORMATINI DEĞİŞTİRİNİZ

        LocalTime mytime = LocalTime.of(16,23,54,435476);
        System.out.println(mytime);

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("hh:mm"); //HH BÜYÜK HH, 24 SAAT SİSTEMİNİ, KÜÇÜK hh, 12 SAAT SİZTEMİNİ GÖSTERİRİ.
        String formattedmytime= dtf7.format(mytime);
        System.out.println(formattedmytime);

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm a "); //mm dem sonra bir boşluk bırakıp küçük a koyulduuğnda saatin yanına AM PM koyar
        String formattedmytime2= dtf8.format(mytime);
        System.out.println(formattedmytime2);

        DateTimeFormatter dtf9=DateTimeFormatter.ofPattern("hh:mm"); //
        String formattedmytime3= dtf9.format(mytime);
        System.out.println(formattedmytime3);
    }
}
