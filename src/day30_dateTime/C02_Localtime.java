package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_Localtime {

	public static void main(String[] args) {

LocalTime zaman=LocalTime.now();
System.out.println("aktüel zaman :"+zaman);
LocalTime time1=LocalTime.of(12,35,23);
System.out.println(time1);
System.out.println("þu zamandan 2 saat ileri 34 dk geri 45 sn ileri :" +zaman.plusHours(2).minusMinutes(34).plusSeconds(45));

for (int i = 0; i < 10000; i++) {
	System.out.println(i);
	
}
LocalTime zaman2=LocalTime.now();
System.out.println();
System.out.println(zaman2);

///ÜLKE SAATLERÝ HESAPLAMA
ZonedDateTime japan=ZonedDateTime.now(ZoneId.of("Japan"));
System.out.println(japan);
	}

}
