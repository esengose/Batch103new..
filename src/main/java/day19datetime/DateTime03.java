package day19datetime;

import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
       // Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz
        LocalDateTime japonya=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanya=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark= ChronoUnit.HOURS.between(almanya,japonya);
        System.out.println(fark);

        //sabit bir tarih oluşturunuz
        LocalDate mydate= LocalDate.of(2011, Month.APRIL,13);
        System.out.println(mydate);
        //ENUM: JAVA DA SABİT DATALARI DEPOLAMAK VE GEREKTİĞİNDE KULLANMAK İÇİN DEPOLAR OLUŞTURURUZ. BUNLARA ENUM DENİR

        //USA İÇİN "WOOW", UK İÇİN "BIG", KANADA İÇİN "COLD", TURKEY İÇİN "VATAN", GERMANY İÇİN "ARABA", RWANDA İÇİN "ÇAY" YAZIN
            Countries country= Countries.USA;
            switch(country){
                case USA:
                    System.out.println("woww");
                    break;
                case CANADA:
                    System.out.println("cold");
                    break;
                case UK:
                    System.out.println("big");
                    break;
                default:
                    System.out.println("tanmlanmamış ülke");
            }


















    }
}
