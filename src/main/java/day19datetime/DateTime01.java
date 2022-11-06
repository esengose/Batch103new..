package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //Anlik tarihi ekrana yazdıran kod //current date

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Anlık zaman current time ekrana yazdıran kod
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        //anlık tarih zaman
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //JAPONYAdaki anlık tarihi ve anlık zamanı ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTimeinJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeinJapan);

        LocalDateTime currentIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentIstanbul);

        //Bugünden 786 gün sonra emekli olunacaksa emeklilik tarihini hesaplayan kod
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);// 2024-12-18

        //Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        //between (dobAli, dobVeli methodu yazıldığında eski olan önce yazılmalıdır

        Long diff= ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);

        //istanbulun fethi ile cumhuriyet kurulması arasında kaç ay olduğunu gösteren kod
        LocalDate istanbulunfethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyet = LocalDate.of(1923,10,29);
        Long aysayisi=ChronoUnit.MONTHS.between(istanbulunfethi,cumhuriyet);
        System.out.println(aysayisi);

        //verilen tarih hangi burcta
        LocalDate mydate= LocalDate.of(1989,4,14);
        int day=mydate.getDayOfMonth();
        int month=mydate.getMonthValue();

        if (day>21 && month==3){
            System.out.println("koç");
        }else if(day<20 && month==4){
            System.out.println("boğa");}



















    }
}
