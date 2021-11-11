package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		
LocalDate tarih=LocalDate.now();//tarih isminde obj creat ettik!!!new anahtarý kullanýlmaz
System.out.println("bugünün tarihi :" +tarih);
		
System.out.println("bugünden 21 gun sonrasi :"+tarih.plusDays(21));// 2021-08-23

System.out.println("bugünden 3 yýl sonrasi :"+tarih.plusYears(3));//2024-08-02
System.out.println("bugünden 3 gun 5 ay 2 yýl sonrasi :"+tarih.plusDays(3).plusMonths(5).plusYears(2));//2024-01-05
System.out.println("bugünden 40 gun öncesi :"+tarih.minusDays(40));//2021-06-23

System.out.println("bugünün 5 yýl öncesi 2 ay sonrasi 3 hafta ertesi :" +tarih.minusYears(5).plusMonths(2).plusWeeks(3) );//2016-10-23



System.out.println(tarih.getDayOfMonth());// 2
System.out.println(tarih.getDayOfWeek());// MONDAY
System.out.println(tarih.getMonthValue());// 8
System.out.println(tarih.getMonth());//AUGUST
System.out.println(tarih.getYear());//2021

LocalDate dogumGnDate=LocalDate.of(1987, 8, 17);
System.out.println("dogum tarihi :" +dogumGnDate);//1987-08-17
System.out.println("dogum günü :"+dogumGnDate.getDayOfWeek());//MONDAY

	}

}
