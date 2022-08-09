package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 01:11:15.172748300
        /*
         Bizim olusturdugumuz date ve time
         canli saat veya tarih degildir
         LocalTime.now(); kullandigimiz satirda
         o anki tarih veya saati alip
         bizim variable'imiza store eder.
         time1 variable'inin degeri SABITTIR
         */
        Thread.sleep(3000);
        time1 = LocalTime.now();
        System.out.println(time1); //01:11:18.210980
        System.out.println(time1.getSecond()); // 18
        System.out.println(time1.plusSeconds(10000)); // 03:57:58.210980
        System.out.println(time1.minusMinutes(200)); // 21:51:18.210980
        System.out.println(time1.withHour(3)); // 03:11:18.210980
    }
}