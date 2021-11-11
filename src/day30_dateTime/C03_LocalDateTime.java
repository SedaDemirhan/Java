package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ltd=LocalDateTime.now();
		System.out.println("aktüel tarih ve zaman :"+ltd);
		
		LocalDate d=LocalDate.of(2016, 1, 10);
		LocalTime t=LocalTime.of(13, 30);
		
		LocalDateTime ltd1=LocalDateTime.of(d, t);
		System.out.println(d);
		System.out.println(t);
		System.out.println(ltd1);
		
		System.out.println(ltd.getHour());// 22
		
		
	}

}
